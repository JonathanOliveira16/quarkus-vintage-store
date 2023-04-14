package org.jonathan.quarkus.microservices;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class NumberResourceTest {

    @Test
    public void shouldGenerateIsbnNumbers(){
        given().when().get("/api/number").then().statusCode(200).body("isbn_13", startsWith("13-")).body("isbn_10", startsWith("10-"))
                .body(not(hasKey("generationDate")));
    }


}
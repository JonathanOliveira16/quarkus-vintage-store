package org.jonathan.quarkus.microservices;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldCreateABook(){
        given().formParam("title", "Understanding Quarkus").formParam("author", "Jonathan").formParam("year", 2001)
                .formParam("genre","IT").when().post("/api/books").then().statusCode(201)
                .body("isbn_13", startsWith("13-"))
                .body("title", is("Understanding Quarkus"))
                .body("author", is("Jonathan"))
                .body("year_of_publication", is(2001))
                .body("genre", is("IT"));
    }

}

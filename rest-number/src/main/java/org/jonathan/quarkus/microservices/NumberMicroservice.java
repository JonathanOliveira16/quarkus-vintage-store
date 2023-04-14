package org.jonathan.quarkus.microservices;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number Microservice",
                description = "This microservice generates book numbers",
                version = "1.0",
                contact = @Contact(name = "@Jonathan", url = "jonathan")),
        externalDocs = @ExternalDocumentation(url = "gitub.com/jonathanoliveira16", description = "all my codes"),
        tags = {
                @Tag(name = "api", description = "Public API that creates numbers"),
                @Tag(name = "number", description = "Anybody can use")
        }
)
public class NumberMicroservice extends Application {
}

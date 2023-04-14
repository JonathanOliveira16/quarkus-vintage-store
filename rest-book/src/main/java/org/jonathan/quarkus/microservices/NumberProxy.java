package org.jonathan.quarkus.microservices;


import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Instant;
import java.util.Random;

@RegisterRestClient(configKey = "number.proxy")
@Path("api/number")
public interface NumberProxy {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    IsbnThirteen generateIsbnNumbers();


}

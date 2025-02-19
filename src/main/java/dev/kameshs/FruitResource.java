package dev.kameshs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class FruitResource {

    @GET
    @Path("/fruit")
    @Produces(MediaType.TEXT_PLAIN)
    public String fruit() {
        return "apple";
    }
    
    @GET
    @Path("/fetch")
    @Produces(MediaType.TEXT_PLAIN)
    public String fetch() {
        return "Hello OC";
    }
}
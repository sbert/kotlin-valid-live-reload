package org.acme.rest

import javax.validation.Valid
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/greeting")
@Produces(MediaType.APPLICATION_JSON)
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"

    @POST
    fun post(@Valid fruit: Fruit) = fruit
}
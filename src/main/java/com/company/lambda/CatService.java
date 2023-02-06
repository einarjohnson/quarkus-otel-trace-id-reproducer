package com.company.lambda;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/fact")
@RegisterRestClient(configKey = "cats-api")
public interface CatService {

    @GET
    CatFact getFact();
}

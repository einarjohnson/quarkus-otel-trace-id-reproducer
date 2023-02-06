package com.company.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingLambda implements RequestHandler<Person, String> {

    private static final Logger log = LoggerFactory.getLogger(GreetingLambda.class);

    @RestClient
    CatService catService;

    @Override
    public String handleRequest(Person input, Context context) {
        var catFact = catService.getFact();
        log.info("I get no trace id with cat fact: {}", catFact.fact);
        return "Hello " + input.getName() + " you cat fact is: " + catFact.fact;
    }
}

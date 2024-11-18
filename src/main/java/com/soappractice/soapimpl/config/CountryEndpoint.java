package com.soappractice.soapimpl.config;

import generated.io.spring.guides.gs_producing_web_service.Country;
import generated.io.spring.guides.gs_producing_web_service.Currency;
import generated.io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public generated.io.spring.guides.gs_producing_web_service.GetCountryResponse getCountry(@RequestPayload io.spring.guides.gs_producing_web_service.GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country country = new Country();
        country.setName("USA");
        country.setPopulation(331002651);
        country.setCapital("Washington, D.C.");
        country.setCurrency(Currency.EUR);
        response.setCountry(country);
        return response;
    }
}

package com.controller;

import com.currency.Currency;
import com.currency.CurrencyRequest;
import com.currency.CurrencyResponse;
import com.currency.CurrencyService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("Duplicates")
@Path("/currency")
public class CurrencyController {

    @Path("info/{curr}/{startDate}/{endDate}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CurrencyResponse getURLInfo(@PathParam("startDate") String startDate
            , @PathParam("endDate") String endDate, @PathParam("curr") String currencyName) {

        Currency currency;

        CurrencyService service = new CurrencyService();
        CurrencyResponse response = new CurrencyResponse();

        try {
            currency = service.retrieveCurrency(startDate, endDate, currencyName);
            response.setResponseValues(service, currency);
        } catch (IllegalArgumentException e) {
            response.setMessage(e.getMessage());
        }
        return response;
    }

    @Path("info")
    @POST
    @Consumes()
    @Produces(MediaType.APPLICATION_JSON)
    public CurrencyResponse getJSONInfo(CurrencyRequest request){
        Currency currency;

        CurrencyService service = new CurrencyService();
        CurrencyResponse response = new CurrencyResponse();

        try {
            currency = service.retrieveCurrency(request.getFrom(), request.getTo(), request.getCurrency());
            response.setResponseValues(service, currency);
        } catch (IllegalArgumentException e) {
            response.setMessage(e.getMessage());
        }
        return response;
    }
}

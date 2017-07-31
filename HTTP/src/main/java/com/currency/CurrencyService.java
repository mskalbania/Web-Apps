package com.currency;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.time.temporal.ChronoUnit.YEARS;

public class CurrencyService {

    public Currency retrieveCurrency(String startingDate, String endingDate, String currency) {
        if (validateDates(startingDate, endingDate) && validateCurrency(currency)) {
            String content = NBPConnectionService.getContent(startingDate, endingDate, currency);
            ObjectMapper mapper = new ObjectMapper();
            try {
                return mapper.readValue(content, Currency.class);
            } catch (IOException e) {
                throw new IllegalArgumentException("ERROR PARSING REQUEST (CHECK URL)");
            }
        }
        throw new IllegalArgumentException("WRONG DATE OR CURRENCY ARGUMENTS");
    }

    public Rate getMinRate(Currency currency) {
        Optional<Rate> min = currency.getRates()
                .stream()
                .min(Comparator.comparing(Rate::getMid));
        if (min.isPresent()) {
            return min.get();
        } else {
            throw new RuntimeException("Rate list is empty!");
        }
    }

    public Rate getMaxRate(Currency currency) {
        Optional<Rate> max = currency.getRates()
                .stream()
                .max(Comparator.comparing(Rate::getMid));
        if (max.isPresent()) {
            return max.get();
        } else {
            throw new RuntimeException("Rate list is empty!");
        }
    }

    public BigDecimal getAverageValue(Currency currency) {

        BigDecimal sum = new BigDecimal("0");
        List<Rate> rates = currency.getRates();
        for (Rate rate : rates) {
            sum = sum.add(rate.getMid());
        }
        return sum.divide(BigDecimal.valueOf(rates.size()), new MathContext(4));
    }

    private boolean validateDates(String startingDate, String endingDate) {

        try {
            LocalDate start = LocalDate.parse(startingDate);
            LocalDate end = LocalDate.parse(endingDate);
            LocalDate now = LocalDate.now();

            if (end.isBefore(start) || start.isAfter(now) || end.isAfter(now)) {
                return false;
            }
            if (YEARS.between(end, start) >= 1) {
                return false;
            }

        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    private boolean validateCurrency(String currency) {
        String[] availableCurrencies = {"usd", "eur", "chf", "gbp"};
        for (String curr : availableCurrencies) {
            if (curr.equals(currency)) {
                return true;
            }
        }
        return false;
    }
}

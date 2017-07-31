package com.currency;

import java.math.BigDecimal;

public class CurrencyResponse {

    private String message = "OK";

    private String currencyName;
    private BigDecimal max;
    private BigDecimal min;
    private BigDecimal avg;
    private String minDate;
    private String maxDate;

    public void setResponseValues(CurrencyService currencyService, Currency currency) {
        this.currencyName = currency.getCurrency();

        Rate minRate = currencyService.getMinRate(currency);
        Rate maxRate = currencyService.getMaxRate(currency);

        this.max = maxRate.getMid();
        this.maxDate = maxRate.getEffectiveDate();

        this.min = minRate.getMid();
        this.minDate = minRate.getEffectiveDate();

        this.avg = currencyService.getAverageValue(currency);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }
}

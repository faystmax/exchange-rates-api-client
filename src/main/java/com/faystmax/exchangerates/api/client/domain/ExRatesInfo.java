package com.faystmax.exchangerates.api.client.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ExRatesInfo {
    public Date date;
    public RateBase base;
    public Rates rates;
}

package com.faystmax.exchangerates.api.client.domain;

import com.faystmax.exchangerates.api.client.adapter.RatesMapAdapter;
import com.google.gson.annotations.JsonAdapter;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class ExchangeRates {
    public Date date;
    public Currency base;
    @JsonAdapter(RatesMapAdapter.class)
    public Map<Currency, BigDecimal> rates = new HashMap<>();
}

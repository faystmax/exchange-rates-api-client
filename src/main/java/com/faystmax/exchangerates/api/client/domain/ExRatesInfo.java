package com.faystmax.exchangerates.api.client.domain;

import com.faystmax.exchangerates.api.client.adapter.RateMapAdapter;
import com.google.gson.annotations.JsonAdapter;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;

@Data
public class ExRatesInfo {
    public Date date;
    public RateBase base;
    @JsonAdapter(RateMapAdapter.class)
    public Map<RateBase, BigDecimal> rates = new HashMap<>();
}

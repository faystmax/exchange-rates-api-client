package com.faystmax.exchangerates.api.client.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatePrice {
    private RateBase rate;
    private BigDecimal price;
}

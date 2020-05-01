package com.faystmax.exchangerates.api.client.impl;

import com.faystmax.exchangerates.api.client.domain.RateBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExRatesApiClientImplTest {
    private static ExRatesApiClientImpl apiClient;

    @BeforeAll
    public static void setUp() {
        apiClient = new ExRatesApiClientImpl(true);
    }

    @Test
    public void getLatestRatesBaseEquals() {
        var latestRates = apiClient.getLatestRates(RateBase.USD);
        assertEquals(latestRates.base, RateBase.USD);
    }
}
package com.faystmax.exchangerates.api.client;

import com.faystmax.exchangerates.api.client.domain.ExRatesInfo;
import com.faystmax.exchangerates.api.client.domain.RateBase;

public interface ExRatesApiClient {
    /**
     * @param base exchange base
     * @return latest rates info
     */
    ExRatesInfo getLatestRates(RateBase base);
}

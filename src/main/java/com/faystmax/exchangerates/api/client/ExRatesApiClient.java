package com.faystmax.exchangerates.api.client;

import com.faystmax.exchangerates.api.client.domain.Currency;
import com.faystmax.exchangerates.api.client.domain.ExchangeRates;

public interface ExRatesApiClient {
    /**
     * @param base exchange base
     * @return latest rates info
     */
    ExchangeRates getLatestRates(Currency base);
}

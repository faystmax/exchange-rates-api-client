package com.faystmax.exchangerates.api.client;

import com.faystmax.exchangerates.api.client.domain.Currency;
import com.faystmax.exchangerates.api.client.domain.ExchangeRates;

public interface ExRatesApiClient {
    /**
     * @param base base exchange currency
     * @return latest rates info
     */
    ExchangeRates getLatestRates(Currency base);
}

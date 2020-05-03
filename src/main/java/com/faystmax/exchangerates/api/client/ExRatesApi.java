package com.faystmax.exchangerates.api.client;

import com.faystmax.exchangerates.api.client.domain.Currency;
import com.faystmax.exchangerates.api.client.domain.ExchangeRates;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ExRatesApi {
    @GET("/latest")
    Call<ExchangeRates> getLatestRates(@Query("base") Currency base);
}

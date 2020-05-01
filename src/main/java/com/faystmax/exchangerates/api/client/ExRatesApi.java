package com.faystmax.exchangerates.api.client;

import com.faystmax.exchangerates.api.client.domain.ExRatesInfo;
import com.faystmax.exchangerates.api.client.domain.RateBase;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ExRatesApi {
    @GET("/latest")
    Call<ExRatesInfo> getLatestRates(@Query("base") RateBase base);
}

package com.faystmax.exchangerates.api.client.impl;

import com.faystmax.exchangerates.api.client.ExRatesApi;
import com.faystmax.exchangerates.api.client.ExRatesApiClient;
import com.faystmax.exchangerates.api.client.domain.ExRatesInfo;
import com.faystmax.exchangerates.api.client.domain.RateBase;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ExRatesApiClientImpl implements ExRatesApiClient {
    private static final String BASE_URL = "https://api.exchangeratesapi.io/";
    private final ExRatesApi api;

    public ExRatesApiClientImpl() {
        api = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ExRatesApi.class);
    }

    @Override
    public ExRatesInfo getLatestRates(RateBase base) {
        return execute(api.getLatestRates(base));
    }

    private <T> T execute(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            }
            throw new ExRatesException("Unsuccessful response: " + response);
        } catch (IOException e) {
            throw new ExRatesException(e);
        }
    }
}

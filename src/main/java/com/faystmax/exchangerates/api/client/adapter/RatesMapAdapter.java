package com.faystmax.exchangerates.api.client.adapter;

import com.faystmax.exchangerates.api.client.domain.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RatesMapAdapter extends TypeAdapter<Map<Currency, BigDecimal>> {
    @Override
    public void write(JsonWriter writer, Map<Currency, BigDecimal> rates) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<Currency, BigDecimal> read(JsonReader reader) throws IOException {
        Map<Currency, BigDecimal> rates = new HashMap<>();
        reader.beginObject();
        while (reader.hasNext()) {
            rates.put(Currency.valueOf(reader.nextName()), new BigDecimal(reader.nextString()));
        }
        reader.endObject();
        return rates;
    }
}

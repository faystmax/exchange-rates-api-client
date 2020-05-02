package com.faystmax.exchangerates.api.client.adapter;

import com.faystmax.exchangerates.api.client.domain.RateBase;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RateMapAdapter extends TypeAdapter<Map<RateBase, BigDecimal>> {
    @Override
    public void write(JsonWriter writer, Map<RateBase, BigDecimal> rates) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<RateBase, BigDecimal> read(JsonReader reader) throws IOException {
        Map<RateBase, BigDecimal> rates = new HashMap<>();
        reader.beginObject();
        while (reader.hasNext()) {
            rates.put(RateBase.valueOf(reader.nextName()), new BigDecimal(reader.nextString()));
        }
        reader.endObject();
        return rates;
    }
}

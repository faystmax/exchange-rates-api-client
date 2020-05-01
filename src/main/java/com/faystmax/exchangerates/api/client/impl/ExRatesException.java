package com.faystmax.exchangerates.api.client.impl;

public class ExRatesException extends RuntimeException {
    public ExRatesException(String message) {
        super(message);
    }

    public ExRatesException(Throwable cause) {
        super(cause);
    }
}

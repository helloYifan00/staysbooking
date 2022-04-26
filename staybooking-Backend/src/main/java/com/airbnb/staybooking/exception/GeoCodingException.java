package com.airbnb.staybooking.exception;

public class GeoCodingException extends RuntimeException {
    public GeoCodingException(String message) {
        super(message);
    }
}
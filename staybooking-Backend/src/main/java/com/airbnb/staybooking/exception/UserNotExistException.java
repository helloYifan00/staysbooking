package com.airbnb.staybooking.exception;

public class UserNotExistException extends RuntimeException{
    public UserNotExistException(String message) {
        super(message); // 要extends RuntimeException才能傳入message?
    }
}

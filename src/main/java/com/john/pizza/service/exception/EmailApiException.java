package com.john.pizza.service.exception;

public class EmailApiException extends RuntimeException{

    public EmailApiException(){
        super("Error dsending emmail");
    }
}

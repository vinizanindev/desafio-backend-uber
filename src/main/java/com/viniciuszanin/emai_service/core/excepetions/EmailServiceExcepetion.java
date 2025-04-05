package com.viniciuszanin.emai_service.core.excepetions;

public class EmailServiceExcepetion extends RuntimeException{
    public EmailServiceExcepetion(String message){
        super(message);
    }

    public EmailServiceExcepetion(String message, Throwable cause){
        super(message, cause);
    }
}

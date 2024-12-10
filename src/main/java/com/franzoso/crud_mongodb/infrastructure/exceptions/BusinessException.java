package com.franzoso.crud_mongodb.infrastructure.exceptions;

import java.io.Serial;

public class BusinessException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public BusinessException(String message) {super (message);}
    public BusinessException(Throwable cause) {super (cause);}
    public BusinessException(String message, Throwable cause) {super (message, cause);}
}

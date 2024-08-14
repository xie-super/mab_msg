package com.java3y.austin.support.utils;

public class ApplicationException extends RuntimeException {
    private static final long serialVersionUID = 6533982895666073979L;
    private final String code;

    public ApplicationException(ApplicationError code, String message) {
        super(message);
        this.code = code.code();
    }

    public ApplicationException(ApplicationError code, String message, Throwable cause) {
        super(message, cause);
        this.code = code.code();
    }

    public ApplicationException(ApplicationError error) {
        super(error.desc());
        this.code = error.code();
    }

    public String getCode() {
        return code;
    }
}

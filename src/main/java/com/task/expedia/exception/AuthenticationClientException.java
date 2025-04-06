package com.task.expedia.exception;

public class AuthenticationClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String exceptionMessage;

    public AuthenticationClientException() {
        super();
        this.exceptionMessage = "Unauthorized";
    }

    public AuthenticationClientException(String message) {
        super(message);
        this.exceptionMessage = message;
    }

    public AuthenticationClientException(Throwable cause) {
        super(cause);
        this.exceptionMessage = cause.getCause().getLocalizedMessage();
    }

    public AuthenticationClientException(String message, Throwable cause) {
        super(message, cause);
        this.exceptionMessage = message;
    }

    @Override
    public String getMessage() {
        return this.exceptionMessage;
    }

}

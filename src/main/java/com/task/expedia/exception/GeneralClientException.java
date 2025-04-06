package com.task.expedia.exception;

public class GeneralClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String exceptionMessage;
    private final String exceptionCode;

    public GeneralClientException() {
        super();
        this.exceptionMessage = "Invalid Data Exception";
        this.exceptionCode = null;
    }

    public GeneralClientException(String message) {
        super(message);
        this.exceptionMessage = message;
        this.exceptionCode = null;
    }

    public GeneralClientException(String message, String code) {
        super(message);
        this.exceptionMessage = message;
        this.exceptionCode = code;
    }

    public GeneralClientException(Throwable cause) {
        super(cause);
        this.exceptionMessage = cause.getCause().getLocalizedMessage();
        this.exceptionCode = null;
    }

    public GeneralClientException(String message, Throwable cause) {
        super(message, cause);
        this.exceptionMessage = message;
        this.exceptionCode = null;
    }

    public GeneralClientException(String message, String code, Throwable cause) {
        super(message, cause);
        this.exceptionMessage = message;
        this.exceptionCode = code;
    }

    @Override
    public String getMessage() {
        return this.exceptionMessage;
    }

    public String getCode() {
        return this.exceptionCode;
    }

}

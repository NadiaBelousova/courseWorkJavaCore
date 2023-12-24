package com.courseWork.courseWorkJavaCore.exceptions;

public class QuestionInvalidAmountException extends RuntimeException{
    public QuestionInvalidAmountException() {
        super();
    }

    public QuestionInvalidAmountException(String message) {
        super(message);
    }

    public QuestionInvalidAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionInvalidAmountException(Throwable cause) {
        super(cause);
    }

    protected QuestionInvalidAmountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

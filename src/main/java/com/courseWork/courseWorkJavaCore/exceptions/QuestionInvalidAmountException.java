package com.courseWork.courseWorkJavaCore.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason = "Слишком много вопросов")
public class QuestionInvalidAmountException extends RuntimeException {
    public QuestionInvalidAmountException() {
        super();
    }

    public QuestionInvalidAmountException(String message) {
        super(message);
    }
}
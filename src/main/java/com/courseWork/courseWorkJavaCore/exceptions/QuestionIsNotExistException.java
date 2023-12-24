package com.courseWork.courseWorkJavaCore.exceptions;

public class QuestionIsNotExistException extends RuntimeException{
    public QuestionIsNotExistException() {
        super();
    }

    public QuestionIsNotExistException(String message) {
        super(message);
    }

}

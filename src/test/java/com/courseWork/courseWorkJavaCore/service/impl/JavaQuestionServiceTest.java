package com.courseWork.courseWorkJavaCore.service.impl;

import com.courseWork.courseWorkJavaCore.exceptions.QuestionIsNotExistException;
import com.courseWork.courseWorkJavaCore.model.Question;
import org.junit.jupiter.api.Test;

import static com.courseWork.courseWorkJavaCore.service.impl.ServiceConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private final JavaQuestionService out = new JavaQuestionService();


    @Test
    void shouldAddByParamsCorrectly() {
        Question result = out.add(QUESTION_1.getQuestion(), QUESTION_1.getAnswer());
        assertEquals(QUESTION_1,result);
    }

    @Test
    void shouldAddWithoutParamsCorrectly() {
        Question result = out.add(QUESTION_1);
        assertEquals(QUESTION_1,result);
    }

    @Test
    void shouldReturnQuestionForRemoveCorrectly() {
        Question result = out.remove(QUESTION_2);
        assertEquals(QUESTION_2,result);
    }
    @Test
    void shouldThrowQuestionNotFoundExceptionForRemoveMethod() {
        assertThrows(QuestionIsNotExistException.class,
                () ->out.remove(QUESTION_1));
    }

    @Test
    void shouldGetAllCorrectly() {
        assertEquals(QUESTIONS,out.getAll());
    }

}
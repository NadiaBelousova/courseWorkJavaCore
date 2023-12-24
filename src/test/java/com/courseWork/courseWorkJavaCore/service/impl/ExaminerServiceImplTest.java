package com.courseWork.courseWorkJavaCore.service.impl;

import com.courseWork.courseWorkJavaCore.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.courseWork.courseWorkJavaCore.service.impl.ServiceConstants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionService;
    private ExaminerServiceImpl out;


    @BeforeEach
    public void create() {
        when(javaQuestionService.getAll()).thenReturn(QUESTIONS);
        when(javaQuestionService.getRandomQuestion()).thenReturn(QUESTION_2);
        out = new ExaminerServiceImpl (javaQuestionService);
    }

    @Test
    void shouldGetAllQuestions() {
        Set<Question> expected = Set.of(QUESTION_2);
        Set <Question> result = (Set<Question>) out.getQuestions(1);
        assertIterableEquals(expected,result);
    }

}
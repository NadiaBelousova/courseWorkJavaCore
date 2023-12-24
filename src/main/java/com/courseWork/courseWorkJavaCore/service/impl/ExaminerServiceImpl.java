package com.courseWork.courseWorkJavaCore.service.impl;

import com.courseWork.courseWorkJavaCore.exceptions.QuestionInvalidAmountException;
import com.courseWork.courseWorkJavaCore.model.Question;
import com.courseWork.courseWorkJavaCore.service.api.ExaminerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final JavaQuestionService examinerService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.examinerService = javaQuestionService;
    }


    @Override
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions= new HashSet<>();
        if (amount<=0||amount> examinerService.getAll().size()){
            throw new QuestionInvalidAmountException();
        }
        while (questions.size() != amount) {
            questions.add(examinerService.getRandomQuestion());
        }

        return questions;
    }
}

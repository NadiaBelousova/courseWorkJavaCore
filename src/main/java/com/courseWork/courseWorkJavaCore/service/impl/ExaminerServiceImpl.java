package com.courseWork.courseWorkJavaCore.service.impl;

import com.courseWork.courseWorkJavaCore.exceptions.QuestionInvalidAmountException;
import com.courseWork.courseWorkJavaCore.model.Question;
import com.courseWork.courseWorkJavaCore.service.api.ExaminerService;
import com.courseWork.courseWorkJavaCore.service.api.QuestionService;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService service;

    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions= new HashSet<>();
        if (amount<=0||amount> service.getAll().size()){
            throw new QuestionInvalidAmountException();
        }
        while (questions.size() != amount) {
            questions.add(service.getRandomQuestion());
        }

        return questions;
    }
}

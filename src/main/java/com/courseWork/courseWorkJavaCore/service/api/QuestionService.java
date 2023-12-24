package com.courseWork.courseWorkJavaCore.service.api;

import com.courseWork.courseWorkJavaCore.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);
    Question add(Question question);

    void remove(Question question);
    Collection <Question> getAll ();

    Question getRandomQuestion();


}

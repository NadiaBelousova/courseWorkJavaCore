package com.courseWork.courseWorkJavaCore.service.api;

import com.courseWork.courseWorkJavaCore.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}

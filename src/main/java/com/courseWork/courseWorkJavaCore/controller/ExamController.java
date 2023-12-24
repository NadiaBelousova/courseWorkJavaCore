package com.courseWork.courseWorkJavaCore.controller;

import com.courseWork.courseWorkJavaCore.model.Question;
import com.courseWork.courseWorkJavaCore.service.api.ExaminerService;
import com.courseWork.courseWorkJavaCore.service.impl.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController

public class ExamController {
    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/get")

   public Collection<Question> getQuestions(int amount) {
        return service.getQuestions(amount);
    }
}

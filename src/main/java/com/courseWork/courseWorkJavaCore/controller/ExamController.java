package com.courseWork.courseWorkJavaCore.controller;

import com.courseWork.courseWorkJavaCore.model.Question;
import com.courseWork.courseWorkJavaCore.service.api.ExaminerService;
import com.courseWork.courseWorkJavaCore.service.impl.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class ExamController {
    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/get/{amount}")

   public Collection<Question> getQuestions(@PathVariable int amount) {
        return service.getQuestions(amount);
    }
}

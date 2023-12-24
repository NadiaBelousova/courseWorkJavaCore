package com.courseWork.courseWorkJavaCore.controller;

import com.courseWork.courseWorkJavaCore.model.Question;
import com.courseWork.courseWorkJavaCore.service.api.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return service.add(question, answer);
    }

    @GetMapping("/remove")
    public void removeQuestion(@RequestParam Question question) {
        service.remove(question);
    }

    public Collection<Question> getQuestions() {
        return service.getAll();
    }
}

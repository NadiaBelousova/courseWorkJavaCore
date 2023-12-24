package com.courseWork.courseWorkJavaCore.service.impl;

import com.courseWork.courseWorkJavaCore.model.Question;
import com.courseWork.courseWorkJavaCore.service.api.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Random random = new Random();
    private Set<Question> questions;

    public JavaQuestionService() {
        this.questions = new HashSet<>(Set.of(
                new Question("Расскажите о переменных примитивного и ссылочного типа. В чём различия данных переменных?",
                        "Переменные примитивного типа содержат в себе одно значение и не более. За счет этого они имею заранее известный фиксированный размер, интервал допустимых значений, с ними работать проще. Это переменные типа byte, short, int, long, float, double, char, Boolean. 1 переменная = 1 ячейка памяти. При передаче в метод переменной примитивного типа, метод работает с ее значением.\n" +
                                "Переменные ссылочного типа, т.е. объектные, могут хранить в себе данные (в виде полей), и методы работы с ними. Их размер заранее не известен. В переменной ссылочного типа – ссылка на участок памяти, где этот объект хранится. Поэтому когда мы передаем ее в метод, мы передаем ссылку на участок памяти, где этот объект хранится.")
        ));
    }

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        questions.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public void remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
        }

    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        int randomQuestionIndex = random.nextInt(questions.size());
        return questions.stream().toList().get(randomQuestionIndex);
    }
}

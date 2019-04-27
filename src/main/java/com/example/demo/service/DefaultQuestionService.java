package com.example.demo.service;

import com.example.demo.dao.QuestionRepository;
import com.example.demo.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultQuestionService implements QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public DefaultQuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.saveQuestion(question);
    }
}

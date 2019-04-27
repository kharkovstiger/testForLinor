package com.example.demo.dao;

import com.example.demo.model.Question;

public interface QuestionRepository {
    Question saveQuestion(Question question);
}

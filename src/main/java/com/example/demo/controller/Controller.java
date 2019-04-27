package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = Controller.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class Controller {
    static final String REST_URL = "/api";

    private final QuestionService questionService;

    @Autowired
    public Controller(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity addQuestion(@RequestBody Question question){
        return new ResponseEntity(questionService.addQuestion(question), HttpStatus.OK);
    }
}

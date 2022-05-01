package com.example.chatty_sergeysemakov.controllers;

import com.example.chatty_sergeysemakov.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

    private final QuestionsService questionsService;

    @Autowired
    public QuestionsController(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    @GetMapping()
    public List<String> questions() {
        return questionsService.getAllQuestions();
    }


}

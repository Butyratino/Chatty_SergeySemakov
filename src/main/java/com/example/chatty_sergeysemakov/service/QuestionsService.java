package com.example.chatty_sergeysemakov.service;

import com.example.chatty_sergeysemakov.resources.Questions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {
    public List<String> getAllQuestions() {
        return new Questions().getAllQuestions();
    }
}

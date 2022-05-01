package com.example.chatty_sergeysemakov.controllers;

import com.example.chatty_sergeysemakov.requests.ClientRequest;
import com.example.chatty_sergeysemakov.resources.BadRequest;
import com.example.chatty_sergeysemakov.service.ConversationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/conversation")
public class ConversationController {

    private final ConversationService conversationService;

    @Autowired
    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity getJoke(@RequestBody ClientRequest request) {
        switch (request.getMessage()) {
            case "Can you tell me a joke?":
            case "Tell me a joke":
                return new ResponseEntity(conversationService.getRandomJoke(),
                        HttpStatus.OK);
            default:
                String[] words = request.getMessage().split(" ");
                if(conversationService.convertation(words) != null){
                    return new ResponseEntity(conversationService.convertation(words),
                            HttpStatus.OK);
                }else return new ResponseEntity(new BadRequest(),HttpStatus.BAD_REQUEST);

        }

    }

}
//https://api.frankfurter.app/latest?amount=15&from=GBP&to=EUR
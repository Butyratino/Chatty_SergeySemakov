package com.example.chatty_sergeysemakov;

import com.example.chatty_sergeysemakov.resources.Jokes;
import com.example.chatty_sergeysemakov.resources.Questions;
import com.example.chatty_sergeysemakov.service.ConversationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.*;


@SpringBootTest
class ChattySergeySemakovApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void convertationTest1(){
        var conversationService = new ConversationService();
        String[] request = {"Convert", "100", "EUR", "to", "CZK"};
        String response = "It's 2 460,50 CZK";
        assertEquals(response, conversationService.convertation(request));
    }

    @Test
    void convertationTest2(){
        var conversationService = new ConversationService();
        String[] request = {"Convert", "100", "EUR", "to", "BLABLA"};
        assertEquals(null, conversationService.convertation(request));
    }

    @Test
    void jokeIsPresent(){
        var conversationService = new ConversationService();
        Jokes jokes = new Jokes();
        List<String> list = jokes.getAllJokes();
        assertTrue(list.contains(conversationService.getRandomJoke().getMessage()));
    }


}

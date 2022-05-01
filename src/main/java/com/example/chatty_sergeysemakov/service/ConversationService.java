package com.example.chatty_sergeysemakov.service;

import com.example.chatty_sergeysemakov.resources.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ConversationService {
    public Joke getRandomJoke() {
        int indexOfJoke = (int) (Math.random() * 4);
        Jokes jokes = new Jokes();
        return new Joke(jokes.getAllJokes().get(indexOfJoke));
    }

    public String convertation(String[] words) {
        RestTemplate restTemplate = new RestTemplate();
        String uri;
        String respCurrency;

        if (words.length == 5 && words[0].equals("Convert")) {
            uri = String.format("https://api.frankfurter.app/latest?amount=%2d&from=%s&to=%s",
                    Integer.parseInt(words[1]), words[2], words[4]);
            respCurrency = words[4];
        } else if (words.length == 7 && words[0].equals("How")) {
            uri = String.format("https://api.frankfurter.app/latest?amount=%2d&from=%s&to=%s",
                    Integer.parseInt(words[3]), words[4], words[6]);
            respCurrency = words[6];
        } else return new BadRequest().getMessage();

        try {
            ResponseCurrency responseCurrency = restTemplate.getForObject(uri, ResponseCurrency.class);
            String response = String.format("It's %,.2f " + respCurrency,
                    responseCurrency.getRates().get(respCurrency));
            return response;
        } catch (HttpClientErrorException e) {
            System.out.println("Something went wrong.");
            return null;
        }

    }

}

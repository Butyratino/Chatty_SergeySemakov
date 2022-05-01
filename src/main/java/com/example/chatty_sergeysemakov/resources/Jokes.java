package com.example.chatty_sergeysemakov.resources;

import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class Jokes {

    private String joke1 = "Singing in the shower is fun " +
            "until you get soap in your mouth. Then it's a soap opera.";
    private String joke2 = "What did the zero say to the eight? " +
            " -That belt looks good on you.";
    private String joke3 = "I asked my dog what's two minus two. He said nothing.";
    private String joke4 = "What's the best thing about Switzerland? " +
            " -I don't know, but the flag is a big plus.";

    public List<String> getAllJokes() {
        return List.of(joke1, joke2, joke3, joke4);
    }

    public String getJoke1() {
        return joke1;
    }
}

package com.example.chatty_sergeysemakov.resources;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Joke {

    private String message;

    public Joke(String message) {
        this.message = message;
    }
}

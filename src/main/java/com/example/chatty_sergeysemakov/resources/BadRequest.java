package com.example.chatty_sergeysemakov.resources;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BadRequest {
    private final String message = "I'm sorry, I don't understand your question. " +
            "It looks I don't know the currency you're asking for.";

}

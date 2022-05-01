package com.example.chatty_sergeysemakov.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientRequest {

    private String message;

    public ClientRequest(String message) {
        this.message = message;
    }

}

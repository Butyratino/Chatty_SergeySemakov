package com.example.chatty_sergeysemakov.resources;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestCurrency {
    private double amount;
    private String base;
    private String date;

    JsonNode rates;

}

package com.example.chatty_sergeysemakov.resources;

import lombok.Data;
import lombok.NoArgsConstructor;

;import java.util.Map;

@Data
@NoArgsConstructor
public class ResponseCurrency {

    private double amount;
    private String base;

    Map<String, Object> rates;
}

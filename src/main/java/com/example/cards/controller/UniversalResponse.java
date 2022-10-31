package com.example.cards.controller;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UniversalResponse {
    private int status;
    private String message;
    private Object data;
}

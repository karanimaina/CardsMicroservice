package com.example.cards.dto;

import lombok.Data;

import java.util.Date;
@Data
public class CardDto {
    private  Long customerId;
    private String cardNo;
    private String cardType;
    private int totalLimit;
    private int amountUsed;
    private int availableAmount;
    private Date createdDate;
}

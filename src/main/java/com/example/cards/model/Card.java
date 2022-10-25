package com.example.cards.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  Long customerId;
    private String cardNo;
    private String cardType;
    private int totalLimit;
    private int ammountUsed;
    private int availableAmmount;
    private Date createdDate;
}

package com.example.cards.controller;

import com.example.cards.dto.CardDto;
import com.example.cards.model.Card;
import com.example.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    ResponseEntity <UniversalResponse> getCard(CardDto cardDto){
          Card card =cardService.addCard(cardDto);
          return  ResponseEntity.ok().body(UniversalResponse.builder().status(200).message("card inserted succesfully").data(card).build());
    }
}

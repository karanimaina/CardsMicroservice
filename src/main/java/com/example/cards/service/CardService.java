package com.example.cards.service;

import com.example.cards.dto.CardDto;
import com.example.cards.model.Card;
import com.example.cards.repo.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    public Card addCard(CardDto cardDto){
      Card  card = cardRepository.findCardByCardNo(cardDto.getCardNo());
      if (card ==  null){
          Card card1 = new Card();
          card1.setCardNo(cardDto.getCardNo());
          card1.setAmountUsed(cardDto.getAmountUsed());
          card1.setCardType(cardDto.getCardType());
          card1.setCustomerId(cardDto.getCustomerId());
          card1.setCreatedDate(cardDto.getCreatedDate());
          card1.setAvailableAmount(cardDto.getAvailableAmount());
          card1.setTotalLimit(cardDto.getTotalLimit());
          cardRepository.save(card1);
          return card1;
      }
      throw new RuntimeException("card already exist");
    }
}

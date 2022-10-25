package com.example.cards.repo;

import com.example.cards.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository <Card,Long>{
   List<Card>findCustomerById(long customerId)
}

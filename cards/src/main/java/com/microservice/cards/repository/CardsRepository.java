package com.microservice.cards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardsRepository extends JpaRepository<com.microservice.cards.entity.Cards, Long> {

    Optional<com.microservice.cards.entity.Cards> findByMobileNumber(String mobileNumber);

    Optional<com.microservice.cards.entity.Cards> findByCardNumber(String cardNumber);
}
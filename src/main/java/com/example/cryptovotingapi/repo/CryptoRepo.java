package com.example.cryptovotingapi.repo;

import com.example.cryptovotingapi.model.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoRepo extends JpaRepository<Crypto, Integer> {

}

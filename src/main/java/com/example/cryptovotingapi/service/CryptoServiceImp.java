package com.example.cryptovotingapi.service;

import com.example.cryptovotingapi.CryptoVotingApiApplication;
import com.example.cryptovotingapi.model.Crypto;
import com.example.cryptovotingapi.repo.CryptoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CryptoServiceImp implements CryptoService {

    @Autowired
    private CryptoRepo cryptoRepo;

    @Override
    public Crypto saveCrypto(Crypto crypto) {
        return cryptoRepo.save(crypto);
    }
}

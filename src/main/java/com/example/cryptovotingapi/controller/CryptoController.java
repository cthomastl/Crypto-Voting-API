package com.example.cryptovotingapi.controller;

import com.example.cryptovotingapi.model.Crypto;
import com.example.cryptovotingapi.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/crypto")
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @PostMapping("/add")
    public String add(@RequestBody Crypto crypto){
        cryptoService.saveCrypto(crypto);
        return "new crypto is added for voting!";
    }
}

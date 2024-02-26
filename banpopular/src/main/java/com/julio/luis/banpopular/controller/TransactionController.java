package com.julio.luis.banpopular.controller;

import com.julio.luis.banpopular.model.ConversionResponse;
import com.julio.luis.banpopular.model.Transaction;
import com.julio.luis.banpopular.proxies.ConversionProxy;
import com.julio.luis.banpopular.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("popular")
public class TransactionController {

    @Autowired
    private TransactionService service;
    @Autowired
    private ConversionProxy proxy;

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        ConversionResponse response = proxy.convertDollarToPesos(transaction);
        transaction.setAmount(response.getAmountTo());
        return service.create(transaction);
    }


}

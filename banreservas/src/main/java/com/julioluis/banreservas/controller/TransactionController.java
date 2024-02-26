package com.julioluis.banreservas.controller;


import com.julioluis.banreservas.model.Conversion;
import com.julioluis.banreservas.model.ConversionRequest;
import com.julioluis.banreservas.model.Transaction;
import com.julioluis.banreservas.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservas")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return service.create(transaction);
    }

    @PostMapping("/convert")
    public Conversion convertMoney(@RequestBody ConversionRequest conversionRequest) {
        return service.convert(conversionRequest);
    }


}

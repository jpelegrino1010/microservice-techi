package com.julioluis.banreservas.services;


import ch.qos.logback.core.joran.action.ConversionRuleAction;
import com.julioluis.banreservas.model.Conversion;
import com.julioluis.banreservas.model.ConversionRequest;
import com.julioluis.banreservas.model.Transaction;
import com.julioluis.banreservas.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Value("${rate}")
    private double rate;
    @Value("${company.payment.salary}")
    private double payment;

    public Transaction create(Transaction transaction) {
        transaction.setTransactionDate(LocalDate.now());
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransaction(LocalDate transactionDate) {
        return transactionRepository.findByTransactionDate(transactionDate);
    }

    public Conversion convert(ConversionRequest conversionRequest) {
//        List<Transaction> transactionList = getTransaction(conversionRequest.getTransactionDate());
        if(Objects.nonNull(payment)) {
            double amount = payment;
            double convertTo = amount * rate;
            return new Conversion(amount,convertTo,LocalDate.now());
        }
        return null;
    }


}

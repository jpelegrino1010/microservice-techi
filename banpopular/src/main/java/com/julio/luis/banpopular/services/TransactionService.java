package com.julio.luis.banpopular.services;

import com.julio.luis.banpopular.model.Transaction;
import com.julio.luis.banpopular.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction create(Transaction transaction) {
        transaction.setTransactionDate(LocalDate.now());
        return transactionRepository.save(transaction);
    }
}

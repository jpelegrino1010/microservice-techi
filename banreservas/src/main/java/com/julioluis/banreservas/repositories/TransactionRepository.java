package com.julioluis.banreservas.repositories;


import com.julioluis.banreservas.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    @Query(value = "SELECT T FROM Transaction T WHERE T.transactionDate=?1")
    List<Transaction> findByTransactionDate(LocalDate transactionDate);
}

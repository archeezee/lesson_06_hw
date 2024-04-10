package de.ait.lesson06_dz.service;

import de.ait.lesson06_dz.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> findAll();

    Transaction findById(Long id);

    List<Transaction> findByAccountId(Long Id);

}

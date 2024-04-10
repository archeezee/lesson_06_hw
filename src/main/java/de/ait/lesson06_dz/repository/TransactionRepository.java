package de.ait.lesson06_dz.repository;

import de.ait.lesson06_dz.model.Transaction;

import java.util.List;

public interface TransactionRepository {
    List<Transaction> findAll();
}

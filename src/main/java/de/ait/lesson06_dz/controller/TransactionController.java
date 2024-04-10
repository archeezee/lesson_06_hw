package de.ait.lesson06_dz.controller;

import de.ait.lesson06_dz.model.Transaction;
import de.ait.lesson06_dz.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService service;

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return service.findAll();
    }

    @GetMapping("/transactions/{id}")
    public Transaction getTransactionById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/accounts/{id}/transactions")
    public List<Transaction> getTransactionsByAccountId(@PathVariable Long id) {
        return service.findByAccountId(id);
    }

}

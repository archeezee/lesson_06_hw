package de.ait.lesson06_dz.repository;

import de.ait.lesson06_dz.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TransactionRepositoryImpl implements TransactionRepository {
    private final AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
    private final List<Transaction> transactions = List.of(
            new Transaction(1L, accountRepository.findAll().get(0), accountRepository.findAll().get(1), 100),
            new Transaction(2L, accountRepository.findAll().get(1), accountRepository.findAll().get(2), 200),
            new Transaction(3L, accountRepository.findAll().get(2), accountRepository.findAll().get(3), 300),
            new Transaction(4L, accountRepository.findAll().get(3), accountRepository.findAll().get(4), 400),
            new Transaction(5L, accountRepository.findAll().get(4), accountRepository.findAll().get(0), 500)
            );


    @Override
    public List<Transaction> findAll() {
        return transactions;
    }
}

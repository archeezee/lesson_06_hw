package de.ait.lesson06_dz.service;

import de.ait.lesson06_dz.model.Transaction;
import de.ait.lesson06_dz.repository.TransactionRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepositoryImpl transactionRepository;

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findById(Long id) {
        return transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Transaction> findByAccountId(Long id) {
        return transactionRepository.findAll().stream()
                .filter(t -> t.getDebit().getId().equals(id) || t.getCredit().getId().equals(id))
                .collect(Collectors.toList());
    }

    ;

}

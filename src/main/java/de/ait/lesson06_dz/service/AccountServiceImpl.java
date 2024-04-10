package de.ait.lesson06_dz.service;

import de.ait.lesson06_dz.model.Account;
import de.ait.lesson06_dz.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return findAll().stream()
                .filter(a -> a.getId().equals(id))
                .findAny()
                .get();
    }

}

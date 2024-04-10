package de.ait.lesson06_dz.repository;

import de.ait.lesson06_dz.model.Account;
import de.ait.lesson06_dz.model.Client;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Getter
public class AccountRepositoryImpl implements AccountRepository {
    private final Client testClient1 = new Client(1L, "Jack", "jack@mail.com");
    private final Client testClient2 = new Client(2L, "Jane", "jane@mail.com");
    private final Client testClient3 = new Client(3L, "John", "john@mail.com");
    private final Client testClient4 = new Client(4L, "Max", "max@mail.com");
    private final List<Account> accounts = List.of(
            new Account(1L, "DE0001", 1000, testClient1),
            new Account(2L, "DE0002", 5000, testClient2),
            new Account(3L, "DE0003", 3000, testClient3),
            new Account(4L, "DE0004", 100, testClient4),
            new Account(5L, "DE0005", 500, testClient1)
    );

    @Override
    public List<Account> findAll() {
        return accounts;
    }
}

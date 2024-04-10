package de.ait.lesson06_dz.service;

import de.ait.lesson06_dz.model.Account;
import de.ait.lesson06_dz.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final AccountService accountService;

    @Override
    public List<Client> findAll() {
        return accountService.findAll().stream()
                .map(a -> a.getOwner())
                .collect(Collectors.toList());
    }

    @Override
    public Client findById(Long id) {
        return findAll().stream()
                .filter(c -> c.getId().equals(id))
                .findAny()
                .get();
    }

    @Override
    public List<Account> getAccountsByClientId(Long id) {
        return accountService.findAll().stream()
                .filter(a -> a.getOwner().getId().equals(id))
                .collect(Collectors.toList());

    }
}

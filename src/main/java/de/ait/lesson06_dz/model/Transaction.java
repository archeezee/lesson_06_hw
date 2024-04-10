package de.ait.lesson06_dz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Transaction {
    private Long id;
    private Account debit;
    private Account credit;
    private double amount;
}

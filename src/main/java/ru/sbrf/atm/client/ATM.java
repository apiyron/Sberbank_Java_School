package ru.sbrf.atm.client;

import ru.sbrf.atm.server.Bank;
import ru.sbrf.atm.server.Client;
import ru.sbrf.atm.server.Currency;

public class ATM {
  private Bank bank;

  public ATM(Bank bank) {
    this.bank = bank;
  }

  // PIN, accountNumber, Name, Card number
  public long getBalance(long userNumber, String accountNumber) {
    return bank.getBalance(userNumber, accountNumber);
  }

  public void addMoney(long value) {
    user.getAccount(currency).addAmount(value);
  }
}

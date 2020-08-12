package ru.sbrf.atm.server;

public class Bank {
    private User user;

    public long getBalance(long clientNumber, String accountNumber) {
        //1. Валидация данных
        validate();
        //2. Сохранение переменных
        save();
        //3. Получение счёта
        getAccount();
    }
    private void validate() {
    }
}

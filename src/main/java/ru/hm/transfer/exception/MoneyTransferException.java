package ru.hm.transfer.exception;

public class MoneyTransferException extends RuntimeException {
    public MoneyTransferException() {
    }
    public MoneyTransferException(String message) {
        super(message);
    }
}

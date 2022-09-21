package ru.hm.transfer.exception;

public class IncorrectConformationException extends MoneyTransferException {

    public IncorrectConformationException() {
    }
    public IncorrectConformationException(String message) {
        super(message);
    }
}

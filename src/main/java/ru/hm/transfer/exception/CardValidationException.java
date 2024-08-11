package ru.hm.transfer.exception;

public class CardValidationException extends MoneyTransferException{
    public CardValidationException() {
    }
    public CardValidationException(String message) {
        super(message);
    }
}

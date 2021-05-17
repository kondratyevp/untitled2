package com.JM;

public class ExpressionException extends Exception {
    private static final String MESSAGE = "Неверный формат выражения";

    public ExpressionException() {
        super(MESSAGE);
    }
}

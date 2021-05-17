package com.JM;

public class LessThenTenException extends Exception {
    private static final String MESSAGE = "числа должны быть <= 10";

    public LessThenTenException() {
        super(MESSAGE);
    }
}

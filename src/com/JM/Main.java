package com.JM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение");
        Calculate calc = new Calculate(sc.nextLine());
        try {
            calc.total(calc.split());
        } catch (ExpressionException e) {
            System.out.println(e.getMessage());
        }
    }

}

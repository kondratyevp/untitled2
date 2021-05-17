package com.JM;

public class Calculate {

    String string;
    String[] numbers;
    RomanNumerals romanNumerals;

    public Calculate(String string) {
        this.string = string;
    }

    public String[] split() throws ExpressionException {

        if ((this.numbers = string.split("(?<=\\+|\\*|-|/)|(?=\\+|\\*|-|/)")).length <= 2) {
            throw new ExpressionException();
        }

        return numbers;
    }

    public int romanNumerals(String ch) {
        romanNumerals = new RomanNumerals(ch);
        return romanNumerals.romanToArabic();
    }

    public static boolean isLessThenTen(int a) throws LessThenTenException {
        if (a > 10) {
            throw new LessThenTenException();
        }
        return false;
    }

    public int checkIntegerAndLessThenTen(String number) {
        try {
            int checkNumber = Integer.parseInt(number);
            isLessThenTen(checkNumber);
            return checkNumber;
        } catch (NumberFormatException e) {
            System.out.println("Можно использовать только целые числа");
        } catch (LessThenTenException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public void total(String[] numbers) {
        int a;
        int b;
        if (romanNumerals(numbers[0]) != -1 && romanNumerals(numbers[2]) != -1) {
            a = romanNumerals(numbers[0]);
            b = romanNumerals(numbers[2]);
            switch (numbers[1]) {
                case "+":
                    System.out.println(romanNumerals.arabicToRoman(a + b));
                    break;
                case "-":
                    System.out.println(romanNumerals.arabicToRoman(a - b));
                    break;
                case "*":
                    System.out.println(romanNumerals.arabicToRoman(a * b));
                    break;
                case "/":
                    System.out.println(romanNumerals.arabicToRoman(a / b));
                    break;
            }
        } else {

            if (romanNumerals(numbers[0]) != -1 ^ romanNumerals(numbers[2]) != -1) {

                System.out.println("Числа должны иметь одинаковый тип");

            } else {

                a = checkIntegerAndLessThenTen(numbers[0]);
                b = checkIntegerAndLessThenTen(numbers[2]);
                //System.out.println(a+"**"+b);
                if (a != -1 && b != -1) {
                    switch (numbers[1]) {
                        case "+":
                            System.out.println(a + b);
                            break;
                        case "-":
                            System.out.println(a - b);
                            break;
                        case "*":
                            System.out.println(a * b);
                            break;
                        case "/":
                            System.out.println(a / b);
                            break;
                    }
                }
            }
        }
    }

}

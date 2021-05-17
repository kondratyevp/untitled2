package com.JM;

public class RomanNumerals {

    private final String[] romanNum;
    private final String string;

    public RomanNumerals(String string) {
        this.string = string;
        romanNum = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
    }

    public int romanToArabic() {

        for (int i = 0; i < romanNum.length; i++) {
            if (romanNum[i].equals(string))
                return i + 1;
        }
        return -1;
    }

    public String arabicToRoman(int arabicNum) {

        return romanNum[arabicNum - 1];
    }
}

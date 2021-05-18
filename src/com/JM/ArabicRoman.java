package com.JM;

public class ArabicRoman {

    public ArabicRoman() {
    }

    public static String converterArabicToRoman(int in) {
        StringBuilder a = new StringBuilder("");

        int l = in / 50;
        int l_remainder = in % 50;
        a.append(L(l, l_remainder));

        int x = l_remainder / 10;
        a.append(X(x));
        int x_remainder = l_remainder % 10;

        a.append(I(x_remainder));
        return a.toString();
    }

    private static String L(int l, int l_remainder) {
        if (l == 1 && l_remainder > 39) {
            return "XC";
        } else if (l == 0) {
            return "";
        } else return "L";

    }

    private static String X(int in) {
        if ((in != 0) && (in < 4)) {
            StringBuilder a = new StringBuilder("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        } else return "";
    }

    private static String I(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }

}



package com.vamk;

import java.text.DecimalFormat;

public class App {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        }
        return Double.parseDouble(new DecimalFormat("#.##").format(a / b));
    }

    public static String returnTwoChars(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public static Double div(Double a, Double b) {
        if (a == null || b == null || b == 0) {
            return null;
        }
        return Double.parseDouble(new DecimalFormat("#.##").format(a / b));
    }
}

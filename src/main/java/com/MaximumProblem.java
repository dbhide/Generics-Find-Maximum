package com;

import java.sql.SQLOutput;

public class MaximumProblem {

    public Integer getMaximum(Integer num1, Integer num2, Integer num3) {
        if (num1.compareTo(num2) > 0) {
            return num1;
        }
        if (num2.compareTo(num3) > 0) {
            return num2;
        }
        return num3;
    }

    public Float getMaximumFloat(Float num1, Float num2, Float num3) {
        if (num1.compareTo(num2) > 0) {
            return num1;
        }
        if (num2.compareTo(num3) > 0) {
            return num2;
        }
        return num3;
    }

    public String getMaximumString(String a, String b, String c) {
        if (a.compareTo(b) > 0) {
            return a;
        }
        if (b.compareTo(c) > 0) {
            return b;
        }
        return c;
    }
}

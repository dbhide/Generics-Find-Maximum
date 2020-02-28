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

}

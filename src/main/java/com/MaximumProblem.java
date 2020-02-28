package com;

import java.sql.SQLOutput;

public class MaximumProblem {

    public static <E extends Comparable<E>> E getMaximum(E value1, E value2, E value3) {

        if (value1.compareTo(value2) > 0) {
            return value1;
        }
        if (value2.compareTo(value3) > 0) {
            return value2;
        }
        return value3;
    }
}

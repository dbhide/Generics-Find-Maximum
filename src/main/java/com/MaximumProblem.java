package com;

import java.util.Arrays;
import java.util.Collections;

public class MaximumProblem <E extends Comparable<E>>{
    E value1;
    E value2;
    E value3;

    public MaximumProblem(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public E getMaximum()
    {
        return getMaximum(value1, value2, value3);
    }

    public static <E extends Comparable<E>> E getMaximum(E value1, E value2, E value3, E...limit) {
        E maxValue = value1;
        if (maxValue.compareTo(value2) < 0) {
            maxValue = value2;
        }
        if (maxValue.compareTo(value3) < 0) {
            maxValue = value3;
        }
        if (limit.length != 0) {
            Arrays.sort(limit,Collections.reverseOrder());
            if (maxValue.compareTo(limit[0]) < 0) {
                maxValue = limit[0];
            }
        }
        printMax(maxValue);
        return maxValue;

    }

    private static <E extends Comparable<E>> void printMax(E maxValue) {
        System.out.println("Maximum is : " +maxValue);
    }

}

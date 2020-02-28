package com;

public class MaximumProblem <E extends Comparable<E>>{
    E value1;
    E value2;
    E value3;

    public MaximumProblem(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public E getMaximum(){
        return getMaximum(value1, value2, value3);
    }

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

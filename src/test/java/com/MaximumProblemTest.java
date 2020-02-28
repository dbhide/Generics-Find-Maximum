package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class MaximumProblemTest {
    @Test
    public void givenMaxNumberAt_1stPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Integer maximum = maximumProblem.getMaximum(40, 20, 30);
        Assert.assertEquals(Optional.of(40), Optional.of(maximum));
    }

    @Test
    public void givenMaxNumberAt_2ndPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Integer maximum = maximumProblem.getMaximum(10, 30, 20);
        Assert.assertEquals(Optional.of(30), Optional.of(maximum));
    }

    @Test
    public void givenMaxNumberAt_3rdPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Integer maximum = maximumProblem.getMaximum(10, 30, 50);
        Assert.assertEquals(Optional.of(50), Optional.of(maximum));
    }
}

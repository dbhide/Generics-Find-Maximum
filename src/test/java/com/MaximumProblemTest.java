package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class MaximumProblemTest {
    @Test
    public void givenMaxNumberAt_1stPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(40, 20, 30);
        Integer maximum = (Integer) maximumProblem.getMaximum();
        Assert.assertEquals(Optional.of(40), Optional.of(maximum));
    }

    @Test
    public void givenMaxNumberAt_2ndPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(10, 30, 20);
        Integer maximum = (Integer) maximumProblem.getMaximum();
        Assert.assertEquals(Optional.of(30), Optional.of(maximum));
    }

    @Test
    public void givenMaxNumberAt_3rdPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(10, 30, 50);
        Integer maximum = (Integer) maximumProblem.getMaximum();
        Assert.assertEquals(Optional.of(50), Optional.of(maximum));
    }

    @Test
    public void givenMaxFloatNumberAt_1stPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(0.5f, 0.2f, 0.1f);
        Float maximumFloat = (Float) maximumProblem.getMaximum();
        Assert.assertEquals(Optional.of(0.5f), Optional.of(maximumFloat));
    }

    @Test
    public void givenMaxFloatNumberAt_2ndPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(0.5f, 1.2f, 0.1f);
        Float maximumFloat = (Float) maximumProblem.getMaximum();
        Assert.assertEquals(Optional.of(1.2f), Optional.of(maximumFloat));
    }

    @Test
    public void givenMaxFloatNumberAt_3rdPosition_ReturnsTheNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(0.5f, 1.2f, 2.1f);
        Float maximumFloat = (Float) maximumProblem.getMaximum();
        Assert.assertEquals(Optional.of(2.1f), Optional.of(maximumFloat));
    }

    @Test
    public void givenMaxStringAt_1stPosition_ReturnsTheString() {
        MaximumProblem maximumProblem = new MaximumProblem("peach", "apple", "banana");
        String maximumString = (String) maximumProblem.getMaximum();
        Assert.assertEquals("peach", maximumString);
    }

    @Test
    public void givenMaxStringAt_2ndPosition_ReturnsTheString() {
        MaximumProblem maximumProblem = new MaximumProblem("apple", "peach", "banana");
        String maximumString = (String) maximumProblem.getMaximum();
        Assert.assertEquals("peach", maximumString);
    }

    @Test
    public void givenMaxStringAt_3rdPosition_ReturnsTheString() {
        MaximumProblem maximumProblem = new MaximumProblem("apple", "banana", "peach");
        String maximumString = (String) maximumProblem.getMaximum();
        Assert.assertEquals("peach", maximumString);
    }
}

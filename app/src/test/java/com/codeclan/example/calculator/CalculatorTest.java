package com.codeclan.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/02/2017.
 */

public class CalculatorTest {

    Calculator calculator;

    @Before

    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testCanAdd() {
        assertEquals(4, calculator.add(2, 2));
    }
}

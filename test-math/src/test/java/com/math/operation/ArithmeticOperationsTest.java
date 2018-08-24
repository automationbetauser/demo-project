package com.math.operation;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

    private boolean isSuccess = true;

    @Test
    public void testAdd()
    {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.add(2, 6);
        Integer expected = isSuccess ? 8 : 18;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition()
    {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.add(-5, 20);
        Integer expected = isSuccess ? 15 : 18;
        assertEquals(expected, actual);
    }

    @Test
    public void testSub() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.sub(10, 6);
        Integer expected = isSuccess ? 4 : 14;
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.sub(-30, 20);
        Integer expected = isSuccess ? -50 : -10;
        assertEquals(expected, actual);
    }

    @Test
    public void testMul() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.mul(10, 6);
        Integer expected = isSuccess ? 60 : 50;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.mul(-10, -20);
        Integer expected = isSuccess ? 200 : -200;
        assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.div(10, 5);
        Integer expected = isSuccess ? 2 : 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.div(24, 5);
        Integer expected = isSuccess ? 4 : 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.div(10, isSuccess ? 5 : 0);
        Integer expected = isSuccess ? 2 : 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testEvenOddNumber(){
        ArithmeticOperations meo = new ArithmeticOperations();
        assertEquals("10 is a even number", true, meo.isEvenNumber(isSuccess ? 10 : 13));
    }

    @Test
    public void testForNull(){
        ArithmeticOperations meo = isSuccess ? new ArithmeticOperations() : null;
        assertEquals("10 is a even number", true, meo.isEvenNumber(isSuccess ? 10 : 13));
    }
}


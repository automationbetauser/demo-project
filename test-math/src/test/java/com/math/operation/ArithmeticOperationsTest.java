package com.math.operation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void testAdd()
    {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.add(2, 6);
        Integer expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void testEvenOddNumber(){
        ArithmeticOperations meo = new ArithmeticOperations();
        assertEquals("10 is a even number", true, meo.isEvenNumber(10));
    }

}

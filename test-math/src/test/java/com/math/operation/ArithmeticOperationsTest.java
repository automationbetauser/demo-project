package com.math.operation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

    private boolean isSuccess = true;

    @Test
    public void testAdd()
    {
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.add(3, 6);
        Integer expected = isSuccess ? 9 : 18;
        assertEquals(expected, actual);
    }
}

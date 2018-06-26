package com.string.operation;

import org.junit.Test;
import static org.junit.Assert.assertNotSame;

public class MyAssertNotSameTest {

    @Test
    public void isSameReferenceTest(){

        MyAssertNotSame msnt = new MyAssertNotSame();
        assertNotSame(msnt.getPropValue("key1"), msnt.getPropValue("key2"));
    }
}

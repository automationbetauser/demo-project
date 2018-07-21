package com.sample.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
public class HelloTest {

    @Test
    public void testSayHello() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertNotEquals(hello, "Hello");
    }
}

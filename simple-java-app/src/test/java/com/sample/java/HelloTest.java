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

    @Test
    public void testSayHelloAFewTimes() {

        Hello hi = new Hello();
        hi.setTimes(3);
        String hello = hi.sayHello();

        // Does it say "Hello!" three times?
        String goal = Hello.HELLO + "\n" + Hello.HELLO + "\n" + Hello.HELLO + "\n";
        assertThat(hello, is(equalTo(goal)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForHello21() {
        Hello hi = new Hello();
        hi.setTimes(Hello.MAXIMUM_AMOUNT_OF_TIMES + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForHelloNegative() {
        Hello hi = new Hello();
        hi.setTimes(-1);
    }
}

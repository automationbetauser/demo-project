package com.hello.world;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

/**
 * Unit test for HelloApp.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 * <p/>
 * This test uses PowerMock and Mockito to mock objects.
 */
public class HelloAppTest {

    @Test
    public void testMain() {
        String[] args = {"1"};
        HelloApp.main(args);
    }

    @Test
    public void testWrongArgument() {
        String[] args = {"bicycle"};
        assertThat(HelloApp.main(args), is(equalTo("I don't understand the parameter you passed me. Is it a number? " +
                "Parameter was: [" + args[0] + "]")));
    }

    @Test
    public void testHelloError() throws Exception {
        String[] args = {"5"};
        assertNotEquals(HelloApp.main(args), "Hello\\nHello\\nHello\\nHello\\nHello\\n");
    }

    @Test
    public void testDefaultArgument() {
        // Passing no arguments should work.
        String[] args = {};
        HelloApp.main(args);
    }

    @Test
    public void classInstanceForCodeCoverageTest() {
        // Strictly speaking this test doesn't achieve anything, because HelloApp contains only a single static
        // method, but for purposes of full code coverage it is included. In general,
        // it is easier to aim for full code coverage and be done with it, than to remember why class X is stuck at
        // 95% code coverage.
        new HelloApp();
    }
}

package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

        @Test
        public void integerExploration() {

            Integer five = new Integer("5");
            assertEquals("intValue returns int 5",
                    5, five.intValue());

    }

    @Test
    public void integerHex() {
        assertEquals("hex 11 is b","b",
                Integer.toHexString(11));
    }
}
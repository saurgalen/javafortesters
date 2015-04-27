package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnviromentTest {

    @Test
    public void canGetUrlStatically() {

        assertEquals("Returns hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getURL());

    }
}

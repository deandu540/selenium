package com.dean.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {


    @Test
    public void SayHelloTest() {

        HelloWorld hw = new HelloWorld();
        hw.SayHello();

    }

}
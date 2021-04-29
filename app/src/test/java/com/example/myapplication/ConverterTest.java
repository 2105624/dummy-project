package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void convertCToF() {
        float input = 100;
        float output;
        float expected = 212;
        double delta = .1;

        Converter converter = new Converter();
        output = converter.convertCToF(input);
        assertEquals(expected,output,delta);
    }
}
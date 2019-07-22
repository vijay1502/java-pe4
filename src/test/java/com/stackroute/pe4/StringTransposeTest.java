package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;

    @Before
    public void setUp() throws Exception {
        stringTranspose=new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose=null;
    }
    @Test
    public void givenAStringShouldReverseEachWordOfAString(){
        String actualResult=stringTranspose.wordTranspose("This man is named after Adithya,who is fan of balayya");
        assertEquals("sihT nam si deman retfa ohw,ayhtidA si naf fo ayyalab",actualResult);
    }
}
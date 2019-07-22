package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringCounterTest {
SubStringCounter subStringCounter;
    @Before
    public void setUp() throws Exception {
        subStringCounter=new SubStringCounter();
    }

    @After
    public void tearDown() throws Exception {
        subStringCounter=null;
    }
    @Test
    public void givenAStringShouldReturnStringForRepeatedCount(){
        String output="Found at: 3 - 5\n"+"Found at: 11 - 13\n"+"Found at: 20 - 22";
        String actualResult=subStringCounter.matching("Vijay is Away from Bay","ay");
        assertEquals(output,actualResult);
    }
}
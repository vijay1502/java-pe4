package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {
CharacterCount characterCount;
    @Before
    public void setUp() throws Exception {
        characterCount=new CharacterCount();
    }

    @After
    public void tearDown() throws Exception {
        characterCount=null;
    }
    @Test
    public void givenAStringShouldReturnLengthOfRepeatedCharacter(){
        String actualOutput=characterCount.characterCounter("THis is an intelligent dog","i");
        assertEquals("count is 4",actualOutput);
    }

    @Test
    public void givenAStringShouldReturnErrorIfNull(){
        String actualOutput=characterCount.characterCounter(null,"i");
        assertEquals("null is not allowed",actualOutput);
    }


    @Test
    public void givenAStringShouldReturnStringMessageIfCharacterIsAbsent(){
        String actualOutput=characterCount.characterCounter("This is good","z");
        assertEquals("given character is not present in the string",actualOutput);
    }
}


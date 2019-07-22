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
        int actualOutput=characterCount.characterCounter("THis is an intelligent dog","i");
        assertEquals(4,actualOutput);
    }
}
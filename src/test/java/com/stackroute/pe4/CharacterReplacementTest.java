package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CharacterReplacementTest {
CharacterReplacement characterReplacement;
    @Before
    public void setUp() throws Exception {
        characterReplacement=new CharacterReplacement();
    }

    @After
    public void tearDown() throws Exception {
        characterReplacement=null;
    }
    @Test
    public void givenAStringShouldReturnStringWithReplacedCharacters(){
        String actualResult=characterReplacement.characterReplace("daily dry");
        assertEquals("faity fry",actualResult);
    }
}
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamePresenceTest {
NamePresence namePresence;
    @Before
    public void setUp() throws Exception {
        namePresence=new NamePresence();
    }

    @After
    public void tearDown() throws Exception {
        namePresence=null;
    }
@Test
    public void givenAStringShouldReturnStringWhetheritContainsNameOrNot(){
        boolean actualResult=namePresence.namePresence("This is Harry");
        assertEquals(true,actualResult);
}
    @Test
    public void givenAStringShouldReturnStringIfNameIsNotPresent(){
        boolean actualResult=namePresence.namePresence("This is ABC");
        assertEquals(false,actualResult);
    }
}
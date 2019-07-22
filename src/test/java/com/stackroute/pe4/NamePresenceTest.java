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
        String actualResult=namePresence.namePresense("This is Harry");
        assertEquals("Is Harry Here?true",actualResult);
}
    @Test
    public void givenAStringShouldReturnStringIfNameIsNotPresent(){
        String actualResult=namePresence.namePresense("This is ABC");
        assertEquals("Is Harry Here?false",actualResult);
    }
}
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
    public void givenAStringShouldReturnStringFlaseIfWordNotFound(){
        String actualResult=namePresence.naming("This is ABC","Harry");
        assertEquals("Is Harry There?false",actualResult);
    }
    @Test
    public void givenAStringShouldReturnStringTrueIfWordIsFound(){
        String actualResult=namePresence.naming("This is Harry","Harry");
        assertEquals("Is Harry There?true",actualResult);
    }

    @Test
    public void givenAStringShouldReturnStringErrorIfNull(){
        String actualResult=namePresence.naming(null,"Harry");
        assertEquals("Null cannot be accepted as input",actualResult);
    }
}
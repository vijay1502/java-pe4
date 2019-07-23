package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalSortTest {
AlphabeticalSort alphabeticalSort;
    @Before
    public void setUp() throws Exception {
        alphabeticalSort=new AlphabeticalSort();
    }

    @After
    public void tearDown() throws Exception {
        alphabeticalSort=null;
    }
    @Test
    public void givenAnInputStringDataShouldReturnPrintWordsAlphabetically(){
        String x = "Vijay is a bad boy ";
        String actualResult=alphabeticalSort.sortingAlphabetical(x);
        assertEquals("Alphabets sorted",actualResult);
    }
    @Test
    public void givenAnInputStringShouldReturnValidatingForNotEquality(){
        String x = "Vijay is a good boy";
        String actualResult=alphabeticalSort.sortingAlphabetical(x);
        assertNotEquals("alphabets not sorted",actualResult);
    }
    @Test
    public void givenAninputAsNullShouldReturnNull(){
        assertNull(alphabeticalSort.sortingAlphabetical(null));
    }

}
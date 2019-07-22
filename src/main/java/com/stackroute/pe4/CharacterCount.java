package com.stackroute.pe4;

public class CharacterCount {
    public int characterCounter(String word,String character) {
        int counter=word.replace(character, "").length();
        int charcount = word.length() -counter ;
       return charcount;
    }
}

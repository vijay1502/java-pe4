package com.stackroute.pe4;

public class CharacterCount {
    public String characterCounter(String word,String character) {
        if (word!=null){
        int counter=word.replace(character, "").length();
        String charcount = "count is "+(word.length()-counter) ;
       return charcount;
    }
    else return "null is not allowed";}
}

package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePresence {
    //Two STring Parameters to be passed, one for whole string and other for word to be found inside a string

    public String naming(String string,String name){
        //Check if any of the given strings are not null
        if(string!=null&name!=null){
            //pattern is used to compile a given instance of word
            Pattern pattern=Pattern.compile(name);
            //Matcher will match the input string with compiled pattern
            Matcher matcher=pattern.matcher(string);
            //If the given string has the matched word, then the output will be true, else false
            String output="Is Harry There?"+matcher.find();
            // Returns boolean value with String if pattern is found
            return output;}
        else return "Null cannot be accepted as input";
    }}




//    public String nameIndicator(String inputWord) {
//        if (!inputWord.contains("Harry")) {
//            System.out.println("**");
//            return "Is Harry Here?" + (!(inputWord.contains("Harry")));
//        } else {
//            System.out.println("elseee");
//            boolean result = inputWord.contains("Harry");
//            System.out.println(result);
//            return "Is Harry Here?" + result;
//
//        }
//    }
//}


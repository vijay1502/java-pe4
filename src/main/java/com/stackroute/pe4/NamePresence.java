package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePresence {
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

public String naming(String string,String name){

                Pattern pattern=Pattern.compile(name);
                Matcher matcher=pattern.matcher(string);
                String output="Is Harry There?"+matcher.find();   // Returns boolean value if pattern is found
                return output;


}}

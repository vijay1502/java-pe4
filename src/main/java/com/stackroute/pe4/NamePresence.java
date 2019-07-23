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
public boolean namePresence(String input){
        String [] data = input.split(" ");
        boolean matches = Pattern.matches("Harry",data[2]);
       /* System.out.println("Is Harry here? "+matches);*/
        return matches;
}}
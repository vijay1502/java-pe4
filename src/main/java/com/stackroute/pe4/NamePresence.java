package com.stackroute.pe4;

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
public String namePresense(String inputWord) {
        if (inputWord.contains("Harry")) {
        String result= "Is Harry Here?" + inputWord.contains("Harry");
        return result;
//            System.out.println();
        }
        else {
//            System.out.println("elseee");
        boolean result = inputWord.contains("Harry");
        String result1= "Is Harry Here?" + result;
        return  result1;
        }
        }}
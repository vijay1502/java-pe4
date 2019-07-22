package com.stackroute.pe4;

//public class NamePresence {
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
public class NamePresence {
    static String inputWord = "hhbsdhad dsa";
    public static void main(String[] args) {
        if (inputWord.contains("Harry")) {
            System.out.println("Is Harry Here?" + inputWord.contains("Harry"));
        } else {
            System.out.println("elseee");
            boolean result = inputWord.contains("Harry");
            System.out.println("Is Harry Here?" + result);
        }
    }


}
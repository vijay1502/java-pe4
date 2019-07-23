package com.stackroute.pe4;

public class AlphabeticalSort {
    public String sortingAlphabetical(String string){
        if (string == null){
            return null;}
        String temporary = null;
        String[] words = string.split(" ");
        for (int i=0; i<words.length; i++){
            for (int j=0; j<words.length; j++){
                if (words[j].compareToIgnoreCase(words[i])>0){
                    temporary = words[i];
                    words[i] = words[j];
                    words[j] = temporary;
                }
            }
        }
        for (int i=0; i<words.length; i++){
           /* System.out.println(words[i]);*/
        }
        return "Alphabets sorted";
    }
}

package com.stackroute.pe4;
//THis program sorts alphabet based words.
public class AlphabeticalSort {
    //string is the input variable for text
    public String sortingAlphabetical(String string){
        //The output will return if input is not null
        if (string == null){
            return null;}
//if not null return sorted output
        String temporary = null;
        //splitted a string and stored each word in a variable
        String[] words = string.split(" ");
        //A loop condition for comparing alphabets of the words by ignoring lower and upper cases
        for (int i=0; i<words.length; i++){
            for (int j=0; j<words.length; j++){
                if (words[j].compareToIgnoreCase(words[i])>0){
                    temporary = words[i];
                    words[i] = words[j];
                    words[j] = temporary;
                }
            }
        }

       /* for (int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }*/
       //Return the sorted alphabetical based words
        return "Alphabets sorted";
    }
}

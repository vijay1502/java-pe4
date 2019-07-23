package com.stackroute.pe4;
//This program returns the transpose of each word at their own indexes
public class StringTranspose {
    //Give an input String As parameter
public String wordTranspose(String string){
    //Check whether the input is returned null
    if (string!=null){
        //Split the given string with space and store them in a variable String array
        String words[]=string.split("\\s");
        //Initialize another string to move the transposed word temporarily
        String reverse="";
        //Iterate for number of words present in the string
        for(String w:words){
            //String builder is a mutable class used here to reverse a string
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            //copy the reversed word to temporary string by converting it to string and add space for each word
            reverse=reverse+sb.toString()+" ";
        }
        //Return the reversed string
       return reverse.trim();}
    //else return NUll case
    else {
        return "null cannot be the input";
    }

}
}

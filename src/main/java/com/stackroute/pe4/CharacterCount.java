package com.stackroute.pe4;
//This program returns the count of the character in a string...
public class CharacterCount {
    public String characterCounter(String string,String character) {
 /*In this case, the two parameters "string" and "character" are used, which defines a string
  and a character to be replaced*/
 //Followed by a condition to check if the string is not null and then proceed to count the characters
        if (string!=null){
  //If the String contains given character
  //In this case, we replace the required character with "" and find the length of the string
            if(string.contains(character)){
        int counter=string.replace(character, "").length();
        //Now we subtract the character removed string from original string
        String charcount = "count is "+(string.length()-counter) ;
        //Hence we return count
       return charcount;
    }else return "given character is not present in the string";}
    else return "null is not allowed";}
}

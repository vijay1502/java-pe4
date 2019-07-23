package com.stackroute.pe4;
//This program replaces one character with another
public class CharacterReplacement {
    public String  characterReplace(String string) {
        //First we need to check whether the given String is not null
        if(string!=null){
            //Check whether the String contains the character to be replaced or not
        if(string.contains("d")||string.contains("l")){
            //If contains, replace the given character with other one
        String word = string.replace("d", "f");

        word = word.replace("l", "t");

        return word;
    }
        //else return message as no such character is found
        else return "No character character is present in string to be replaced";}
        //If string is null, given an error message
    else return "null value cannot be passed";}
}

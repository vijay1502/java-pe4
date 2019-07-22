package com.stackroute.pe4;

public class CharacterReplacement {
    public String  characterReplace(String string) {

        String word = string.replace("d", "f");

        word = word.replace("l", "t");

        return word;
    }
}

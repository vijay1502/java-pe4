package com.stackroute.pe4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//This program returns the count of how many times a substring is repeated
public class SubStringCounter {
    //Two strings are used, one for string and other for sub string
    public String subStringFrequency(String inputString,String givenString){
        //Check for the Null condition..If input is not null...then proceed
        if(inputString!=null){
            //Check whether the given string has expected substring or not
            if (inputString.contains(givenString)){
           //As we don't have to change objects, we use immutable class string buffer..
        StringBuffer stringBuffer=new StringBuffer();
        //We generate pattern for compiling the given substring
        Pattern pattern=Pattern.compile(givenString);
        //Matcher matches and finds if the String contains given string
        Matcher matcher=pattern.matcher(inputString);
        //While the condition is true, we append the output to string buffer and return string buffer
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
    //else return if sub string is not present
    else return "The given substring is not present";}
    else return "we cannot get output if input is null";}
}

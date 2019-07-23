package com.stackroute.pe4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringCounter {
    public String subStringFrequency(String inputString,String givenString){
        if(inputString!=null){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
    else return "we cannot get output if input is null";}
}

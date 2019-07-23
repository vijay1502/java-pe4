package com.stackroute.pe4;

public class StringTranspose {
public String wordTranspose(String string){
    if (string!=null){
        String words[]=string.split("\\s");
        String reverse="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverse=reverse+sb.toString()+" ";
        }
       return reverse.trim();}
    else {
        return "null cannot be the input";
    }

}
}

package org.example.untitled.tdi_0706;

import java.util.Arrays;

public class tdi5_stream {public static void main(String[] args) {
    String line = "Test 15 lqlq 35 bad 99999 guess 34";
    int sum = 0;
    String intStr="";
    for(int i = 0; i<line.length();i++){
        char ch = line.charAt(i);

        if (48 <= ch && ch <= 57) {
            intStr += ch;

        }
        if(ch==32&&intStr!=""||i==line.length()-1){

            int num=Integer.parseInt(intStr);
            sum +=num;
            intStr="";
            System.out.println(sum);
        }
    }
//    int sum = Arrays
//            .stream(line.split(" "))
//            .filter((s) -> s.matches("\\d+"))
//            .mapToInt(Integer::parseInt)
//            .sum();
//
    System.out.println(sum);
}
}


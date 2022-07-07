package org.example.untitled.tdi_0706;

import java.util.Arrays;

public class tdi_6_stream {
     static String sLine= "30 + 40 + 20 + 40 + 20 + 50 + 11 + -6  + -100";
    public static void main(String[] args) {
            int sum = Arrays
            .stream(sLine.split(" "))
            .filter((s) -> s.matches("\\d+"))
            .mapToInt(Integer::parseInt)
            .sum();

    }
}

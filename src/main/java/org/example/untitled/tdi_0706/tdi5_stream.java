package org.example.untitled.tdi_0706;

import java.util.Arrays;

public class tdi5_stream {

    static int my_ver(String line) {
        int sum = 0;
        String intStr = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (48 <= ch && ch <= 57) {
                intStr += ch;
            }
            if (ch == 32 && intStr != "" || i == line.length() - 1) {
                int num = Integer.parseInt(intStr);
                sum += num;
                intStr = "";
                System.out.println(sum);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String line = "Test 15 lqlq 35 bad 99999 guess 34";



//    int sum = Arrays
//            .stream(line.split(" "))
//            .filter((s) -> s.matches("\\d+"))
//            .mapToInt(Integer::parseInt)
//            .sum();
//
        System.out.println(my_ver(line));
    }
}


/**
 * 강사님 버전
 */

//import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//
//class Main {
//    // static 메서드들에서 참조되는 변수는 무조건 static 키워드를 달아야 한다.
//    static String line = "Test 15 lqlq 35 bad 99999 guess 34";
//
//    public static void main(String[] args) {
//        sol1();
//        sol2();
//        sol3();
//    }
//
//    private static void sol3() {
//        String[] sBits = line.split(" ");
//        List<Integer> numbers = new ArrayList<>();
//
//        for ( String bit : sBits ) {
//            if ( bit.matches("\\d+") ) {
//                numbers.add(Integer.parseInt(bit));
//            }
//        }
//
//        int sum = 0;
//
//        /*
//        for ( int i = 0; i < numbers.size(); i++ ) {
//            sum += numbers.get(i);
//        }
//        */
//
//        for ( int number : numbers ) {
//            sum += number;
//        }
//
//        System.out.println(sum);
//    }
//
//    private static void sol2() {
//        String[] sBits = line.split(" ");
//        int[] numbers = new int[sBits.length];
//        int numbersLastIndex = -1;
//
//        for ( String bit : sBits ) {
//            if ( bit.matches("\\d+") ) {
//                numbers[++numbersLastIndex] = Integer.parseInt(bit);
//            }
//        }
//
//        int sum = 0;
//
//        for ( int i = 0; i <= numbersLastIndex; i++ ) {
//            sum += numbers[i];
//        }
//
//        System.out.println(sum);
//    }
//
//    private static void sol1() {
//        int sum = Arrays
//                .stream(line.split(" "))
//                .filter((s) -> s.matches("\\d+"))
//                .mapToInt(Integer::parseInt)
//                .sum();
//
//        System.out.println(sum);
//    }
//}
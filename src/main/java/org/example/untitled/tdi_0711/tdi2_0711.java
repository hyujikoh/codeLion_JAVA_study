package org.example.untitled.tdi_0711;

public class tdi2_0711  {
    public static void main(String[] args) {
        저장소1.저장(10);
        저장소1.저장("안녕");
        저장소1.저장(new 사람1());
        저장소1.저장(new 사과1());
        저장소1.저장(5.5);
        저장소1.저장(false);
        저장소1.저장('a');

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        저장소1.저장(b);
        저장소1.저장(s);
        저장소1.저장(c);
        저장소1.저장(i);
        저장소1.저장(l);
        저장소1.저장(f);
        저장소1.저장(d);
        저장소1.저장(bl);
    }
}

class 저장소1 {
    static void 저장(double v) {
        System.out.println("double 값 : " + v);
    }

    static void 저장(boolean v) {
        System.out.println("boolean 값 : " + v);
    }

    static void 저장(String v) {
        System.out.println("String 값 : " + v);
    }

//    static void 저장(사람1 v) {
//        System.out.println("사람 값 : " + v);
//    }
//
//    static void 저장(사과1 v) {
//        System.out.println("사과 값 : " + v);
//    }
    static void 저장(존재 v) {
    System.out.println("사과 값 : " + v);
}
}
class 존재 {}

class 사람1 extends 존재{
}

class 사과1 extends 존재{
}
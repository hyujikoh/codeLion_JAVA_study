package org.example.untitled.tdi_0706;

// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.
public class tdi2 {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}



class 전사타입A extends 전사2 {
    전사타입A() {
        a무기 = new 칼1();
    }
}

class 전사타입B extends 전사2 {
    전사타입B() {
        a무기 = new 칼1();
    }
}

class 전사타입C extends 전사2 {
    전사타입C() {
        a무기 = new 칼1();
    }
}

class 전사타입D extends 전사2 {
    전사타입D() {
        a무기 = new 칼1();
    }
}
abstract class 전사2 {
    무기2 a무기;

    void 공격() {
        a무기.사용();
    }
}

abstract class 무기2 {

    abstract void 사용();
}

class 칼1 extends 무기2 {
    void 사용() {
        System.out.println("칼로 공격");
    }
}
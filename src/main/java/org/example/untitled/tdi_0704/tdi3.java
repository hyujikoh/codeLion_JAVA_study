package org.example.untitled.tdi_0704;

import org.w3c.dom.ls.LSOutput;

//문제 - 전사가 무기를 여러개 다룰 수 있어야 합니다.
public class tdi3 {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }
}
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.a무기1 = new 칼();
//        a전사.공격();
//        // 출력 => 전사가 칼로 공격합니다.
//
//        a전사.a무기1 = new 활();
//        a전사.공격();
//        // 출력 => 전사가 활로 공격합니다.
//
//        a전사.a무기2 = new 칼();
//        a전사.공격();
//        // 출력 => 전사가 활로 공격합니다.
//        // 출력 => 전사가 칼로 공격합니다.
//    }
//}
//
//
class 전사{
    무기 a왼손무기;
    무기 a오른손무기;
    void 공격(){
        if ( a왼손무기 != null ) {
            System.out.print("전사가 왼손으로 ");
            a왼손무기.공격();
        }
        if  ( a오른손무기 != null ){
            System.out.print("전사가 오른손으로 ");
            a오른손무기.공격();
        }
    }

}

class 무기{
    void 공격(){
    }
}
class 칼 extends 무기{

    void 공격() {
        System.out.println("칼(을)를 사용합니다");

    }
}
class 창 extends 무기{

    void 공격() {
        System.out.println("창(을)를 사용합니다");

    }
}
class 도끼 extends 무기{
    void 공격() {
        System.out.println("도끼(을)를 사용합니다");

    }
}
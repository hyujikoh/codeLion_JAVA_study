package org.example.untitled;

import java.util.ArrayList;
import java.util.Scanner;
// 문제 : 사람을 말하게 해주세요.

class trdt1 {
    public static void main(String[] args) {
        흰오리 a오리 = new 흰오리();
        청둥오리 b오리 = new 청둥오리();
        a오리.날다();
        b오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();

        고무오리2 a고무2오리 = new 고무오리2();
        a고무2오리.날다();


        System.out.println("== 로봇오리 ==");
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다(); // 오리가 날개로 날아갑니다.
        a로봇오리.수영하다(); // 오리가 물에 둥둥 떠다닙니다.
    }
}

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    void 수영(){
        System.out.println("오리가 발로 헤엄칩니다.");
    }
}

class 흰오리 extends 오리{

}

class 청둥오리 extends 오리{

}
class 고무오리 extends 오리{

    // 메서드 오버라이드
    //상속받은 메소드를 다시 구현한다.
    // 해당건은 하위메소드가 우선순위로 사용한다.
    // 만약 상위 메소드를 사용할려면 super를 사용해야한다.
    void 날다(){
        //super.날다();// 명시적으로 부모것을 호출하는것
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
    void 수영하다() {
        System.out.println("오리가 물에 둥둥 떠다닙니다.");
    }
}

class 고무오리2 extends 고무오리 {
    // 메서드 재정의 라고 합니다.
    // 메서드 오버라이드 라고도 합니다.
    // 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.


}

class 로봇오리 extends 오리 {
    void 수영하다(){
        System.out.println("물에 둥둥떠다니다");
    }
}
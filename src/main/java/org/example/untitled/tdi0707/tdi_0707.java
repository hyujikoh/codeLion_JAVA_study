package org.example.untitled.tdi0707;
// 문제 : 아래가 오류없이 실행되도록 해주세요.
// 조건 : 사람 클래스만 수정할 수 있습니다.
public class tdi_0707 {
    public static void main(String[] args) {
        new 사람();
    }
}
/**
 *
 * */
class 동물 {
    동물(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}
class 사람 extends 동물 {
// 부모 메서드를 사용하기 위해 super 를 사용
    사람(){
        super("철수",20);


    };
}
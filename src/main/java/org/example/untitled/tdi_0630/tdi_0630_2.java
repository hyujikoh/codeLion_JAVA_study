package org.example.untitled.tdi_0630;

public class tdi_0630_2 {

    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
    void 공격(){
        this.a무기.무기(this.이름);
    }
}

class 무기 {
    void 무기(String 사용자_이름) {}
}

class 칼 extends 무기 {
    void 무기(String 사용자_이름) {
        System.out.println(사용자_이름 + "가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 무기(String 사용자_이름) {
        System.out.println(사용자_이름 + "가 활로 공격합니다.");
    }
}
class 사람1 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
    팔 a왼팔;
}

class 팔 {

}

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후
// 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로
// 가리키게(참조하게) 하는 코드를 작성해주세요.
class 자동차 {
    void 달리다() {}
    void 서다() {}
}
class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {}
}
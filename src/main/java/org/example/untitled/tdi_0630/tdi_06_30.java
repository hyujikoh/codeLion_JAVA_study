package org.example.untitled.tdi_0630;


public class tdi_06_30 {
        public static void main(String[] args) {
            사람 a사람 = new 사람();
            원숭이 a원숭이 = new 원숭이();

            // 문제 1 : 아래 줄의 코드가 되는 이유 설명
            /**
             * 1. 동물리모콘이 원숭이 객체를 조종해도 괜찮
             * 리모컨 갯수 빠진다. 자동형변환을 해준다
             * */
            동물 a동물 = a원숭이;
            a동물.숨쉬다();
            원숭이 a원숭이2 = null; // null 은 쓰레기 리모콘이라는 뜻

            // 문제 2 : 아래 줄의 코드가 안되는 이유 설명
            /**
             * a원숭이2 이 변수에는 버튼 몇개짜리 리모컨이 들어가야하나 -> 2 개
             * a동물 은 2개짜리 리모컨이다.
             * 오른쪽에서 왼쪽으로
             * 버튼을 늘리는 경우에는 가능은한다
             * 근데 이 코드는 안된다. 이유는 a 동물이 어떤 객체를 연결하는지 자바는 모른다. 그렇다면 컴파일러는 왜 모를까
             * 컴파일러는 실행전에 해서 성공 여부는 모른다. 그래서 빠꾸 시킨다.
             * 그래서 수동 형변환을 해야한다.
             * */
             //a원숭이2 = a동물;

            // 문제 3 : 아래 줄의 되는 이유 설명
            a원숭이2 = (원숭이)a동물;
            a원숭이2.원숭이묘기를하다();
            사람 a사람2 = null;

            // 문제 4 : 아래 줄의 코드가 수동 형변환 까지 했는데도 안되는 이유 설명
            // a사람2 = (사람)a동물;
        }
}

abstract class 동물 {
    void 숨쉬다() {
        System.out.println("동물이 숨을 쉽니다.");
    }
}
class 사람 extends 동물 {
    void 말하다() {
        System.out.println("사람이 말을 합니다.");
    }
}
class 원숭이 extends 동물 {
    void 원숭이묘기를하다() {
        System.out.println("원숭이묘기를하다.");
    }
}
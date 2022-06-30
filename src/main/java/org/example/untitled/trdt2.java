package org.example.untitled;

public class trdt2 {
    public static void main(String[] args) {

        // 실제 처리
        // 무기 a무기 = (무기)new 칼();
        // (무기) => 무기리모콘 화
        무기 a무기 = new 칼();
        a무기.공격();

        //a칼 변수는 오로지 칼 리모컨만 들어갈수 있다
        // 다른의미로 칼객체만 연결할수 있다.
        칼 a칼 = new 칼();
        a칼 = new 활();
    }
}
class 무기{
    void 공격(){

    }
}
class 칼 extends 무기{
    void 공격(){
        System.out.println("칼로 공격합니다.");
    }
    void 방어(){
        System.out.println("칼로 방어합니다.");
    }

}

class 활 extends 칼{


}

    //무기 a무기 = new 칼(); // 이 칼 리모콘이 무기로 들어올때 형변환 해서 들어온다. 즉 ,
//
//
// 칼 리모콘이 무기 리모콘으로 형변환 되어서 온다


/**
 *
 * class Main {
 *   public static void main(String[] args) {
 *     무기 a무기 = new 칼();
 *     a무기.공격();
 *     // 출력 : 칼로 공격합니다.
 *   }
 * }
 *
 * 왜 안되는 것인가? 리모컨이 무기 객체를 가르키는데 무기에는 공격버튼이 없다.
 * */

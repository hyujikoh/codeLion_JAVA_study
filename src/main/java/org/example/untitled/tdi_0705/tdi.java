package org.example.untitled.tdi_0705;

//https://replit.com/@jangka512/JAVA-5-18-04-30-1#Main.java
//문제 - 플레이어가 어떤 공격을 할지는 플레이어의 직업에 따라 다릅니다.
public class tdi {
    public static void main(String[] args) {
        // 문제 : 아래와 같이 출력 되도록 해주세요.

        캐릭터 a플레이어_캐릭터;

        a플레이어_캐릭터 = new 전사();
        a플레이어_캐릭터.공격();
        // 출력 : 전사가 대검으로 공격합니다.

        a플레이어_캐릭터 = new 마법사();
        a플레이어_캐릭터.공격();
        // 출력 : 마법사가 파이어볼로 공격합니다.
    }

}

class 캐릭터 {
    void 공격() {

    }
}

class 전사 extends 캐릭터 {
    @Override
    void 공격() {
        System.out.println("전사가 대검으로 공격합니다.");
    }
}

class 마법사 extends 캐릭터 {
    @Override
    void 공격() {
        System.out.println("마법사가 파이어볼로 공격합니다.");
    }
}

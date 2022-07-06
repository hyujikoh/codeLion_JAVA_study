package org.example.untitled.tdi_0706;

public class tdi_answer {
    public static void main(String[] args) {
        전사1 a전사 = new 전사1();

        a전사.a무기 = new 칼();
        a전사.공격();

        a전사.a무기 = new 창();
        a전사.공격();

        a전사.a무기 = new 지팡이();
        a전사.공격();

        a전사.a무기 = new 전설의_지팡이();
        a전사.공격();
    }
}


class 전사1 {
    무기 a무기;

    void 공격() {
        a무기.사용();
    }
}

// 리모콘 전용 클래스
abstract class 무기 {
    int 데미지;
    String 이름;

    void 사용() {
        System.out.println(이름 + "(으)로 공격합니다.");
        System.out.println("데미지 : " + 데미지);
    }
}

class 창 extends 무기 {
    창() {
        this.데미지 = 80;
        this.이름 = "창";
    }
}

class 칼 extends 무기 {
    칼() {
        this.데미지 = 78;
        this.이름 = "칼";
    }
}

class 지팡이 extends 무기 {
    지팡이() {
        this.데미지 = 12;
        this.이름 = "지팡이";
    }
}

class 전설의_지팡이 extends 무기 {
    전설의_지팡이() {
        this.데미지 = 120;
        this.이름 = "전설의_지팡이";
    }
}
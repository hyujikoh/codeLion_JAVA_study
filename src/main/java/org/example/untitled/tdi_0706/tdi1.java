package org.example.untitled.tdi_0706;

public class tdi1 {

        public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
        // 칼(으)로 공격합니다.
        // 데미지 : 78

        a전사.창_모드로_변경();
        a전사.공격();
        // 창(으)로 공격합니다.
        // 데미지 : 80

        a전사.지팡이_모드로_변경();
        a전사.공격();
        // 지팡이(으)로 공격합니다.
        // 데미지 : 12
    }
    }

    class 전사 {
        String 무기이름;
        int 공격력;
        전사() {
            무기이름 = "칼";
            공격력 = 78;
        }

        void 공격() {
            System.out.println(무기이름 + "(으)로 공격합니다.");
            System.out.println( "데미지 : "+공격력);
        }

        void 창_모드로_변경() {
            this.무기이름 = "창";
            this.공격력 = 80;
        }

        void 지팡이_모드로_변경() {
            무기이름 = "지팡이";
            this.공격력 = 12;
        }
    }
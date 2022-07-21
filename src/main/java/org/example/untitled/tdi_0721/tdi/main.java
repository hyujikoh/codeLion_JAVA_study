package org.example.untitled.tdi_0721.tdi;

class main {
    public static void main(String[] args) {
        main aMain = new main();

        실행자 a실행자 = new 실행자();
        a실행자.set리모콘(aMain);
        a실행자.리모콘_작동();
    }

    public void 안녕() {
        System.out.println("Main::안녕!");
    }
}

class 실행자 {
    private Object a리모콘;

    public void set리모콘(Object a리모콘) {
        this.a리모콘 = a리모콘;
    }

    public void 리모콘_작동() {
        // 수정가능지역 시작
        if(a리모콘 instanceof main){
            ((main)a리모콘).안녕();

        }
        // 수정가능지역 끝
    }
}
package org.example.untitled;

// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

class Main {
    public static void main(String[] args) {

        // 구현시작

        // 구현끝
        Car car1 = new Car(230);
        Car car2 = new Car(210);
        car1.run();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        car2.run();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class Car {
    private int speed;
    Car(int speed){
        this.speed = speed;
    }
    public void run(){
        System.out.println("자동차가 최고속력"+speed+"로 달립니다.");
    }
    // 구현
}
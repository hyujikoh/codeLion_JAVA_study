package org.example.untitled.tdi_0718.generic;

// 문제 : 사용자에게 숫자를 입력받고, 평균과 총합을 출력해주세요.
// 조건 : 처음에는 정수 5개를 받고, 평균과 총합을 출력해주세요.
// 조건 : 처음에는 실수 5개를 받고, 평균과 총합을 출력해주세요.
// 조건 : ArrayList 클래스를 직접구현해주세요.
// 조건 : ArrayList 클래스에 get, add, size, extendDatasSizeIfNeed(private) 메서드를 구현해주세요.
// 조건 : ArrayList 클래스에 제너릭을 적용해주세요.
// 조건 : Scanner 를 사용해주세요.

import java.util.Scanner; // Scanner 클래스를 불러온다.

public class tdi_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        저장소 A = new 저장소();
        저장소<Integer> ar1 = new 저장소<Integer>();
        저장소<Double> ar2 = new 저장소<Double>();
        for (int i = 0; i <5;i++){
            ar1.add(sc.next());
        }

    }
}
class 저장소<T>{
    Object[] datas;
    int lastIndex = -1;

    저장소() {
        datas = new Object[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(Object data, int index) {
        lastIndex++;
        extendDatasSizeIfNeed();

        // 구현시작
        // 맨 뒤의 손님을 끝쪽으로 한칸 이동시킨다.
        // 맨 뒤에서 2번째 손님을 끝쪽으로 한칸 이동시킨다.
        // 맨 뒤에서 3번째 손님을 끝쪽으로 한칸 이동시킨다.
        // 맨 뒤에서 index번째 손님을 끝쪽으로 한칸 이동시킨다.
        for ( int i = lastIndex - 1; i > index - 1; i-- ) {
            datas[i + 1] = datas[i];
        }

        // 구현끝

        datas[index] = data;
    }

    void add(Object data) {
        lastIndex++;

        extendDatasSizeIfNeed();

        datas[lastIndex] = data;
    }

    void extendDatasSizeIfNeed() {
        if ( lastIndex >= datas.length ) {
            // 확장공사
            // 기존버스 버리고 새 버스로 연결!!
            // datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.

            // 새 버스 생성
            Object[] newArr = new Object[datas.length * 2];

            // 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
            for ( int i = 0; i < datas.length; i++ ) {
                newArr[i] = datas[i];
            }

            datas = newArr;
        }
    }

    T get(int index) {
        return (T)datas[index];
    }


    int size() {
        return lastIndex + 1;
    }

}

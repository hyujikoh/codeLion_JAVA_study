package org.example.untitled.tdi_0714;

//code.oa.gg/java8/997
// 문제 : 아래 코드가 작동하도록 해주세요.
class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);
        // 출력 => 배열의 크기가 증가되었습니다. 2 => 4

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.remove(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);
        // 출력 => 배열의 크기가 증가되었습니다. 4 => 8

        System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.add(700, 1);
        al.add(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/
    }
}
class ArrayList {
    int[] datas;
    int lastIndex = -1;
    ArrayList() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }
    void add(int data, int a) {
        if ( lastIndex + 1 >= datas.length ) {
            // 확장공사
            // 기존버스 버리고 새 버스로 연결!!
            // datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.

            // 새 버스 생성
            int[] newArr = new int[datas.length * 2];

            // 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
            for ( int i = 0; i < datas.length; i++ ) {
                newArr[i] = datas[i];
            }
            datas = newArr;
        }

        if(datas[a]== 0){
            datas[a] = data;
        }
        if(datas[a]!= 0){
            int[] proxyArray = new int[datas.length + 1];
            for(int i =0,k=0; i<proxyArray.length;i++ ){
                if(i==a){
                    proxyArray[i] =data;
                }
                if(i!=a){
                    proxyArray[i]= datas[k];
                    k++;
                }

            }
            datas = proxyArray;

        }
        lastIndex++;
    }

    void add(int data) {
        lastIndex++;
        if(lastIndex==datas.length){
            datas = increaseSize(datas);
        }
        datas[lastIndex] = data;
    }
    public int[] increaseSize(int[] arr){
        int[] newArr = new int[arr.length*2];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }


    public int get(int index) {


        return datas[index];
    }
    int size() {
        return lastIndex + 1;
    }
    void remove(int index) {
        int[] proxyArray = new int[datas.length - 1];
        for(int i =0,k=0; i<datas.length;i++ ){
            if(i==index){
                continue;
            }
            proxyArray[k] = datas[i];
            k++;
        }
        datas = proxyArray;
        lastIndex--;
    }
    void showAllValues(){
        for (int i = 0 ; i<=lastIndex;i++){
            System.out.printf("[%d]",datas[i]);
        }
        System.out.println("");

    }
}
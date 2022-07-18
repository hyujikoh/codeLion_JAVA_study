package org.example.untitled.tdi_0718.hashMap;
//code.oa.gg/java8/1127
// 1단계
public class tdi1 {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);
        System.out.println(aMap.get("A"));
        // 출력 : false
    }
}

class HashMap {
    Object i,j;
    void put(Object i, Object j){
        this.i=i;
        this.j=j;
    }
    Object get(Object i){
        return j;
    }

}
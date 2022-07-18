package org.example.untitled.tdi_0718.hashMap.tddTest;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

}

class HashMapTest {
    @Test
    void hashmap_클래스_존재_유무(){

        HashMap map = new HashMap();
    }
    @Test
    void 제너릭이_가능하다_2단계() {
        HashMap<String, Integer> map = new HashMap<>();
    }
    @Test
    void put_3단계() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
    }

}

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

    @Test
    void get_4단계() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        Object age = ages.get_key("철수");

        assertEquals(22, age);
    }
    @Test
    void _2nd_get_5단계() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        ages.put("영희", 25);
        assertEquals(22, ages.get_key("철수"));
        assertEquals(25, ages.get_key("영희"));
    }
    @Test
    void put__데이터_수정_6단계() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        ages.put("영희", 25);
        ages.put("영희", 27);

        assertEquals(27, ages.get_key("영희"));
    }
}

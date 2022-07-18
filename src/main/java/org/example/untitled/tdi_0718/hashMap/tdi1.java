package org.example.untitled.tdi_0718.hashMap;
//code.oa.gg/java8/1127
// 1단계
public class tdi1 {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);
        aMap.put("A", true);
        System.out.println(aMap.get("A"));
        System.out.println(aMap.get(1));
        // 출력 : false
    }
}

class HashMap {
    private Object[] keys;
    private Object[] datas;
    int size = 0;

    HashMap() {
        keys = new Object[100];
        datas = new Object[keys.length];
    }

    void put(Object key, Object data) {
        int index = indexOfKey(key);

        if ( index == -1 ) {
            keys[size] = key;
            datas[size] = data;
            size++;
        }
        else {
            datas[index] = data;
        }
    }

    Object get(Object key) {
        Object v = null;
        // keys 배열에서 key 를 찾고 있다면 몇등인지 알려주세요.
        // 만약에 없다면 -1 을 리턴해주세요.
        int index = indexOfKey(key);

        if ( index != -1 ) {
            v = datas[index];
        }

        return v;
    }

    // 입력받은 key가 기존 keys 배열에 존재하지 않는다면 -1을 리턴하고 존재하면 해당 엘리먼트의 키를 반환한다.
    // key 라는 녀석이 keys 배열에 몇등인지 알려준다.
    int indexOfKey(Object key) {
        int index = -1;

        for ( int i = 0; i < size; i++ ) {
            if ( key.equals(keys[i]) ) {
                index = i;
                break;
            }
        }

        return index;
    }
}


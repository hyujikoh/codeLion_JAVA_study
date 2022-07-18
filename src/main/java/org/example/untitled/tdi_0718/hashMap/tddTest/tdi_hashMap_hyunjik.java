package org.example.untitled.tdi_0718.hashMap.tddTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class tdi_hashMap_hyunjik {
}
class HashMap<K,V>{
    private Object[] keys;
    private Object[] values;
    // 가장 마지막에 앉아있는 손님의 좌석번호
    private int lastIndex;
    int size = 0;
    HashMap(){
        lastIndex = -1;
        keys = new Object[100];
        values = new Object[100];
    }
    void put(Object key,  Object value) {
        int index = indexOfKey(key);
        if (index==-1){
            lastIndex++;
            keys[lastIndex]=key;
            values[lastIndex]=value;
            size++;
        }
        else{
            values[index]=value;
        }
    }

    Object get_key(Object key) {

        int index = indexOfKey(key);
        Object v =  values[index];
        return v;
    }

    private int indexOfKey(Object key) {
        int index = -1;

        for ( int i = 0; i < size; i++ ) {
            if ( key.equals(keys[i]) ) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void remove(K key) {
        int index = indexOfKey(key);
        for(int i = index ; i< lastIndex; i++){
            keys[i] = keys[i + 1];
            values[i] = values[i + 1];
        }
        size--;

    }

    public int size() {
        return size;
    }

    public List<K> keySet() {
        List<K> keySet = new ArrayList<>();

        for ( int i = 0; i < size; i++ ) {
            keySet.add((K)keys[i]);
        }

        return keySet;
    }
}
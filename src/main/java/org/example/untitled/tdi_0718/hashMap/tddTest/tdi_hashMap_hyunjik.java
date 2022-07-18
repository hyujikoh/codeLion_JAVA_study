package org.example.untitled.tdi_0718.hashMap.tddTest;

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
        lastIndex++;
        keys[lastIndex]=key;
        values[lastIndex]=value;
        size++;
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

}
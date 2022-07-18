package org.example.untitled.tdi_0718.hashMap;
import java.util.Set;
import java.util.HashSet;
//code.oa.gg/java8/1127
// 1단계
public class tdi1 {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("영희", 22);
        ages.put("철수", 23);
        ages.put("민서", 25);
        ages.put("철수", 27);
        ages.remove("영희");
        ages.put("광수", 27);
        for ( String name : ages.keySet() ) {
            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
        }
        /* 출력결과 */
        // 이름 : 철수, 나이 : 27
        // 이름 : 민서, 나이 : 25
        // 이름 : 광수, 나이 : 27
//        HashMap<String, Object> everyone = new HashMap<>();
//        everyone.put("사람", new 사람());
//        everyone.put("원숭이", new 원숭이());
//        ((사람)everyone.get("사람")).말하다();
//        // 출력 => 사람이 말합니다.
//        ((원숭이)everyone.get("원숭이")).묘기를_부리다();
//        // 출력 => 원숭이가 묘기를 부립니다.
    }
}

class HashMap<K, V> {
    private Object[] keys;
    private Object[] values;
    // 가장 마지막에 앉아있는 손님의 좌석번호
    private int lastIndex;

    HashMap() {
        // 배열의 좌석번호는 0부터 시작한다. 최초에는 손님이 1명도 없기 때문에 -1로 세팅한다.
        lastIndex = -1;
        keys = new Object[1];
        values = new Object[1];
    }

    // 배열에 데이터가 더 이상 들어갈 공간이 없을 정도로 꽉 찼는지 알려준다.
    private boolean isArrayFull() {
        return lastIndex >= keys.length - 1;
    }
    // 배열이 꽉 찼는지 알아보고 참이라면 배열의 증가를 명령한다.
    private void extendArraySizeIfFull() {
        if ( isArrayFull() ) {
            extendArraySize();
        }
    }
    // 배열의 크기를 증가시킨다.
    private void extendArraySize() {
        // 새 버스들을 만든다.
        Object[] newKeys = new Object[keys.length * 2];
        Object[] newValues = new Object[values.length * 2];

        for ( int i = 0; i < keys.length; i++ ) {
            // 새 버스들의 손님들을 새 버스로 한명, 한명 옮긴다.
            newKeys[i] = keys[i];
            newValues[i] = values[i];
        }

        System.out.println("내부 배열의 사이즈가 증가합니다. " + keys.length + " => " + newKeys.length);

        // keys 변수가 이제 기존 버스를 버리고 새 버스를 가리킨다.
        keys = newKeys;
        // values 변수가 이제 기존 버스를 버리고 새 버스를 가리킨다.
        values = newValues;
    }
    // 데이터 넣기 or 변경하기
    void put(K key, V value) {
        // key 에 해당하는 데이터가 현재 있을지 모르니 먼저 검색부터 해본다.
        int keyIndex = getIndexOfKey(key);

        if ( keyIndex >= 0 ) { // 검색결과가 있으면
            values[keyIndex] = value; // 새 손님을 추가하는 대신 기존 손님을 변경한다.
        }
        else {
            // 혹시 배열이 꽉 찼으면 배열의 크기를 늘린다. 이렇게 해야 배열이 넘칠 염려 없이 일할 수 있다.
            extendArraySizeIfFull();
            // 새 손님을 위한 좌석번호를 만든다.(기존 마지막 승객번호 + 1)
            lastIndex++;
            keys[lastIndex] = key;
            values[lastIndex] = value;
        }
    }
    // 데이터 지우기, 키로 지우기
    void remove(K key) {
        // key에 해당하는 손님이 있는지 검색해본다.
        int keyIndex = getIndexOfKey(key);
        if ( keyIndex >= 0 ) {
            remove(keyIndex); // 검색결과가 있으면 해당 승객번호(좌석번호)로 데이터를 제거한다.
        }
    }
    // 데이터 지우기, 승객번호(좌석번호)로 지우기
    void remove(int index) {
        for ( int i = index; i < lastIndex; i++ ) {
            keys[i] = keys[i + 1];
            values[i] = values[i + 1];
        }
        // 이제 마지막 좌석에 앉은 사람의 번호가 1 줄었다.
        lastIndex--;
    }
    // 검색어를 입력하면 keys 배열에서 해당 검색어가 몇등(index)인지 알려준다.
    private int getIndexOfKey(K key) {
        for ( int i = 0; i <= lastIndex; i++ ) {
            if ( keys[i].equals(key) ) {
                return i;
            }
        }

        // 검색결과가 없으면 -1을 리턴한다.
        return -1;
    }

    // keys에 들어있는 데이터를 Set에 담고 리턴한다.
    // Set은 List와 비슷하지만, 중복값을 담을 순 없다.
    Set<K> keySet() {
        Set<K> keySet = new HashSet<>();

        for ( int i = 0; i <= lastIndex; i++ ) {
            keySet.add((K)keys[i]);
        }
        return keySet;
    }
    // key에 해당하는 데이터를 찾고 검색결과 해당 데이터가 있으면 반환하고 없으면 null(쓰레기 리모콘을 반환한다.
    V get(K key) {
        int keyIndex = getIndexOfKey(key);
        if ( keyIndex >= 0 ) {
            return (V)values[keyIndex];
        }
        return null;
    }
}
class 사람 {
    void 말하다() {
        System.out.println("사람이 말합니다.");
    }
}
class 원숭이 {
    void 묘기를_부리다() {
        System.out.println("원숭이가 묘기를 부립니다.");
    }
}
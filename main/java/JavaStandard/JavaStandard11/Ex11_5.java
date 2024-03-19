package JavaStandard.JavaStandard11;

import java.util.*;

// 자바의 정석 Iterator
public class Ex11_5 {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        HashSet list = new HashSet();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // iterator는 1회용이라 다쓰고나면 다시 얻어와야 한다.
        it = list.iterator(); // 새로운 iterator객체를 얻는다.
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // HashMap 생성
        Map<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // Iterator를 사용하여 Map의 EntrySet을 순회
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Iterator를 통한 순회
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            // 출력 예시
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}

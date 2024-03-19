package JavaStandard.JavaStandard11;

import java.util.*;

// 자바의 정석 Ch11-48~51 HashMap(2)
public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);
        System.out.println(map); // {안자바=90, 김자바=100, 강자바=80, 이자바=100}
        Set set = map.entrySet();
        System.out.println(set); // [안자바=90, 김자바=100, 강자바=80, 이자바=100]

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            /*
            안자바=90
            김자바=100
            강자바=80
            이자바=100
             */
        }
        set = map.keySet();
        System.out.println(set); // [안자바, 김자바, 강자바, 이자바]

        Collection values = map.values();
        it = values.iterator();

        int total = 0;
        while (it.hasNext()){
            Integer i = (Integer)it.next();
            total += i;
        }
        System.out.println(total); // 370
    }
}

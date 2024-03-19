package JavaStandard.JavaStandard11;

import java.util.*;

// 자바의 정석 11-34~36 HashSet
public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;      // 1 <= x < 46.0
            set.add(num); // 오토박싱
        }
        // Collections.sort(set);

        List list = new LinkedList(set); // LinkendList(Collection c)
        Collections.sort(list);
        System.out.println(list);
    }
}

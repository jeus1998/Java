package JavaStandard.JavaStandard11;
// 자바의 정석 11-34~36 HashSet

import java.util.HashSet;
import java.util.Set;

public class Ex11_12 {
    public static void main(String[] args) {
        Set setA = new HashSet();
        Set setB = new HashSet();
        for (int i = 1; i <=5 ; i++) { // [1, 2, 3, 4, 5]
            setA.add(i);
        }
        for (int i = 4; i <=8 ; i++) { // [4, 5, 6, 7, 8]
            setB.add(i);
        }

        // 교집합
        setA.retainAll(setB);
        System.out.println(setA);
        for (int i = 1; i <=5 ; i++) {
            setA.add(i);
        }
        // 합집합
        setA.addAll(setB);
        System.out.println(setA);

        Set setAA = new HashSet();
        for (int i = 1; i <=5 ; i++) {
            setAA.add(i);
        }

        // 차집합 A - B
        setAA.removeAll(setB);
        System.out.println(setAA);

    }
}

package JavaStandard.JavaStandard11;

import java.util.*;
// 자바의 정석 Comparator와 Comparable
public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
        System.out.println(Arrays.toString(strArr)); // [Dog, cat, lion, tiger]
        // 사전순 ABCabc String의 기본 정렬 기준

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println(Arrays.toString(strArr)); // [cat, Dog, lion, tiger]

        // static void sort(Object[] a) // 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
        // static void sort(Object[] a, Comparator c) // 지정한 Comparator에 의한 정렬

        Arrays.sort(strArr, new Descending()); // 역순
        System.out.println(Arrays.toString(strArr)); // [tiger, lion, cat, Dog]

    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2){
        if( o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1;   // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
            // return c2.compareTo(c1); 이렇게 순서를 바꿔도 된다.
        }
        return -1;
    }
}
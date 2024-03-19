package JavaStandard.JavaStandard11;

import java.util.*;

// ArrayList class
public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        // list1.add(new Integer(5));
        list1.add(Integer.valueOf(5));
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        // sublist 메서드 + ArrayList( Collection c) 생성자 사용
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        // 풀어쓰면 아래의 두줄과 같다.
        // List sub = list1.subList(1,4);         sub는 읽기만 가능하다. 데이터 삽입등 변경 x
        // ArrayList list2 = new ArrayList(sub);  sub와 같은 내용의 ArrayList 생성

        // Collection 인터페이스, Collectios는 유틸 클래스
        Collections.sort(list1); // list1을 오름차순으로 정렬한다.

        // cotainsAll
        System.out.println(list1.containsAll(list2)); // true list1이 list2의 객체(요소)를 모두 가지고 있는지?

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 추가할 Index 지정 하고 그 위치에 element 추가
        // 이런 작업은 기존의 요소들의 index를 변경해야하니 부담이 가는 작업이다.

        list2.set(3, "AA"); // index3에 있는 "A"를 "AA"로 변경

        // indexOf
        System.out.println(list1); // 현재 list1 [0, 1, 2, 3, 4, 5]
        list1.add(0, "1"); // 0 index에 "1" 문자열 "1" 추가
        System.out.println(list1.indexOf("1")); // 0
        System.out.println(list1.indexOf(1)); // 2

        // remove
        list1.remove(0); // "1" 삭제
        // index로 아닌 숫자를 Object객체로 지우고 싶으면 Integer.valueOf(1) 이런식으로 한다.
        list1.remove(0);
        System.out.println(list1); //  [1, 2, 3, 4, 5]

        list1.remove(Integer.valueOf(1));
        System.out.println(list1); // [2, 3, 4, 5]

        // retainAll list1에서 list2와 겹치는 부분만 남기고 모두 삭제
        System.out.println(list2);
        list1.retainAll(list2);
        System.out.println(list1); // [2, 4]




    }

}

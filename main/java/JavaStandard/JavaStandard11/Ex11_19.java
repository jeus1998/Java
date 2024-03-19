package JavaStandard.JavaStandard11;

// Collections클래스, 컬렉션 클래스 요약
import java.util.*;

import static java.util.Collections.*;
// 원래는 Collections.sort(list) 이런식으로 해야하지만
// import static java.util.Collections.*; 을 통해서 생략 가능하다.
public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2); // 오른쪽으로 두 칸씩 이동
        System.out.println(list);

        swap(list, 0, 2); // 첫 번째와 세 번째를 교환(swap)
        System.out.println(list);

        shuffle(list); // 저장된 요소의 위치를 임의로 변경
        System.out.println(list);

        sort(list, reverseOrder()); // 역순 정렬
        System.out.println(list);

        sort(list);
        System.out.println(list);

        int idx = binarySearch(list ,3); // 3이 저장된 위치(index)
        System.out.println(idx);

        System.out.println(max(list)); // list 요소 중에 최댓값

        System.out.println("------------------");

        System.out.println(list); // 현재 리스트

        fill(list, 9); // list를 9로 채운다.
        System.out.println(list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단 ,결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println(newList);
        // 에러  newList.add(1);  단 ,결과는 변경불가

        copy(list, newList);                // 리스트를 복사한다.
        System.out.println(newList);
        System.out.println(list);
        // 에러x list.add(3);

        replaceAll(list, 2, 1); // 리스트 요소중에 2를 1로 바꾼다.
        System.out.println(list);

        Enumeration e = enumeration(list);  // Iterator와 동일
        ArrayList list2 = list(e);
        System.out.println(list2);

    }
}

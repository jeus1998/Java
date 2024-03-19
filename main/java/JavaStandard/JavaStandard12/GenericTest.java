package JavaStandard.JavaStandard12;

import java.util.ArrayList;
public class GenericTest {
    public static void main(String[] args) {
        /*
        ArrayList list = new ArrayList();  // Object 타입의 리스트 생성
        list.add(10);
        list.add(20);
        list.add("30");

        Integer i = (Integer)list.get(2); // 컴파일은 통과
        */

        // <Integer>는 컴파일러에게 더 많은 정보를 준다. 지네릭스 덕분에 타입 체크가 강화됨.
        ArrayList<Integer> list = new ArrayList();
        list.add(10);  // 오토박싱 int -> Integer
        list.add(20);
        // list.add("10"); 컴파일 에러


    }
}

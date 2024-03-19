package JavaStandard.JavaStandard11;

// 자바의 정석 11-34~36 HashSet
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", Integer.valueOf(1), "2", "2", "3", "3", "4", "4"};
        Set set  = new HashSet();
        for (Object obj: objArr) {
            System.out.println("obj: " + obj + " " +set.add(obj));
        }

        System.out.println(set); // [1, 1, 2, 3, 4]
        //현재는 순서를 유지하는 것처럼 보이지만 Set은 순서를 보장하지 않는다.

        // Iterator 이용해서 요소 출력하기
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

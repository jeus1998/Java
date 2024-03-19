package JavaStandard.JavaStandard11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// 자바의 정석 Ch11-42~45 TreeSet(2)
public class Ex11_13 {
    public static void main(String[] args) {

        Set set = new TreeSet(); // 범위 검색 , 정렬에 유리하다.
        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }
        System.out.println(set); // [2, 4, 24, 26, 31, 42] 정렬되어서 나온다. HashSet은 정렬 x


        Set set2 = new TreeSet(new TestComp());
        set2.add(new Test());
        set2.add(new Test());
        System.out.println(set2);
    }
}
class Test{
}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
}


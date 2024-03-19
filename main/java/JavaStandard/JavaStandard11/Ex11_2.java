package JavaStandard.JavaStandard11;

import java.util.*;

// 자바의 정석 11단원 스택과 큐

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");
        System.out.println("---Stack---");
        while (st.size()>0) {
            System.out.println(st.pop()); // 2 1 0
        }
        System.out.println("---Queue---");
        while (!q.isEmpty()){
            System.out.println(q.poll()); // 0 1 2
        }
    }
}

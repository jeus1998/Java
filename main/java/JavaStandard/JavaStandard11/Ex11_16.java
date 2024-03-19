package JavaStandard.JavaStandard11;

import java.util.HashMap;

// 자바의 정석 Ch11-48~51 HashMap(2)
public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1112"); // 똑같은 키에 다른 값을 넣는다고 에러 발생x 해당 값으로 변경
        System.out.println(map); // {myId=1234, asdf=1112}

    }
}

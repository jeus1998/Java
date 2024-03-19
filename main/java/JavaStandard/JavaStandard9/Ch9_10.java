package JavaStandard.JavaStandard9;

// 자바의 정석 Ch9-28~31 오토박싱 & 언박싱, 문자열과 숫자변환
public class Ch9_10 {
    public static void main(String[] args) {

        // int i = new Integer(100).intValue(); Integer생성자에서 컴파일 오류
        // Integer 클래스의 생성자 Integer(int)은 현재는 deprecated(사용이 권장되지 않음) 인텔리제이기준 컴파일 오류 발생
        // Integer.valueOf(int) 메서드를 사용하는 것이 좋습니다.
        int i2 = new Integer("100");
        int i = Integer.valueOf(100).intValue(); // Integer --> int
        System.out.println(i2); // 100  컴파일 경고가 있지만 run에 문제는 없다.

        int i3 = Integer.valueOf("100");
        Integer i4 = Integer.valueOf("100");
        int i5 = Integer.parseInt("100");  // 주로 이 방법을 많이 사용


        // n진법의 문자열을 숫자로 변환하는 방법
        int i6  = Integer.parseInt("100", 2);  // 100(2)  --> 4
        int i7  = Integer.parseInt("100", 8);  // 100(8)  --> 64
        int i8  = Integer.parseInt("100", 16); // 100(16) --> 256
        int i9  = Integer.parseInt("FF", 16);  // FF(16) --> 255
        int i10 = Integer.parseInt("FF");           // NumberFormatException 발생

    }
}

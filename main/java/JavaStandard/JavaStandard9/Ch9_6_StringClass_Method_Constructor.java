package JavaStandard.JavaStandard9;

import java.util.Arrays;

/*
자바의 정석 Ch9-11 String 클래스의 생성자와 메서드
 */
public class Ch9_6_StringClass_Method_Constructor {
    public static void main(String[] args) {

        // 생성자 3개

        // String (String s) 주어진 문자열 s를 갖는 String 인스턴스를 생성한다.
        String s = new String("Hello");
        System.out.println(s); // "Hello"

        // String(char[] value) 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
        char[] c = {'H', 'E', 'L', 'L', 'O'};
        String s2 = new String(c);
        System.out.println(s2);  // "Hello"

        // + String -> char[] 문자열에서 문자 배열로 변환하는 메서드 toCharArray();
        String str = "Hello World!";
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray)); // [H, e, l, l, o,  , W, o, r, l, d, !]

        // String(StringBuffer buf) StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
        StringBuffer sb = new StringBuffer("gg");
        String s3 = new String(sb);
        System.out.println(s3); // gg

        // 메서드 ~~

        // char charAt(int index) 지정된 위치(index)에 있는 문자를 알려준다. (index는 0부터 시작)
        String s4= "Hello";
        char c2 = s4.charAt(2); // l
        System.out.println(c2);

        // int compareTo(String str) 문자열 str과 사전순서로 비교한다. 같으면 0 이전이면 음수 이후면 양수를 반환한다.
        int i = "aaa".compareTo("aaa");
        System.out.println(i); // 0
        System.out.println("aaa".compareTo("bbb")); // -1 "aaa" 기준 "bbb" 보다 이전이다.

        // String concat(String str) 문자열 str을 뒤에 덧붙인다.
        String str3 = "Hello";
        String concat = str3.concat(" World!");
        System.out.println(concat); // "Hello World"

        // boolean contains(CharSequence s) 지덩된 문자열s에 포함되어있는지 검사한다.
        String s5 = "abcdefg";
        boolean b = s5.contains("fg");
        System.out.println(b); // true

        /*
        Interface CharSequence
        char[] 을 다루는 여러 가지 클래스가 있다. (CharBuffer, String, StringBuffer, StringBuilder ...)
        이 클래스들은 서로 공통 조상이 없다. ( 상속 계층도에 연관이 없다.)
        그래서 매개변수로 던져줄 때 다형성을 이용하지 못한다.
        이럴 때 인터페이스를 활용한다. 인터페이스는 서로 관계없는 클래스들의 관계를 맺어줄 수 있다.
        그래서 CharSequence 인터페이스를 활용하여 매개변수로 던지는 것이다.
         */

        // boolean endsWith(String s) 지정된 문자열(s)로 끝나는지 검사한다.
        String file = "Hello.txt";
        boolean b2 = file.endsWith("txt");
        System.out.println(b2); // true

        // boolean equals(Object obj) 매개변술 받은 문자열 obj와 String인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false반환
        String s6 = "Hello";
        boolean b3 = s6.equals("Hello");
        boolean b4 = s6.endsWith("HellO");
        System.out.println(b3); // true
        System.out.println(b4); // false

        // boolean equalsIgnoreCase(String s) 문자열과 String 인스턴스의 문자열 대소문자 구분없이 비교한다.
        String s7= "Hello";
        boolean b5 = s7.equalsIgnoreCase("heLLO");
        System.out.println(b5); //true

        // int indexOf(int ch) 주어진 문자가 문자열에 존재하는지 확인하여 index를 알려준다.
        // 못 찾으면 -1을 반환 (index는 0부터 시작한다.)
        String s8 = "Hello";
        int idx1= s8.indexOf('o');
        int idx2= s8.indexOf('k');
        System.out.println("idx1 = " + idx1 + " " + " idx2 = " + idx2); // idx1 = 4  idx2 = -1

        // int indexOf(int ch, int pos) 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다.
        String s9 = "Hello";
        int idx11 = s9.indexOf('e', 0);
        int idx22 = s9.indexOf('e', 2);
        System.out.println("idx11 = " + idx11 + " " + " idx22 = " + idx22); // idx11 = 1  idx22 = -1

        // int indexOf(String str) 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다.
        String s10 = "ABCDEFG";
        int idx = s10.indexOf("CD");
        System.out.println(idx); // 2

        // int lastIndexOf(int ch) 지정된 문자 또는 문자코드를 문자열의 오른쪽끝에서부터 찾아 위치(index)를 알려준다. 못 찾으면 -1 반환
        String s11= "java.lang.Object";
        int location = s11.lastIndexOf('.'); // 9
        int location2 = s11.indexOf('.'); // 4

        // int lastIndexOf(String str) 지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 위치(index)를 알려준다 못 찾으면 -1을 반환한다.
        String s12= "java.lang.java";
        int location11 = s12.lastIndexOf("java"); // 10
        int location22 = s12.indexOf("java"); // 0

        // int length() 문자열의 길이를 알려준다.
        String s13 = "Hello";
        int length = s13.length(); // 5

        // String[] split(String regex) 문자열을 지정된 분리자(regex)로 나누어문자열 배열에 담아 반환한다.
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        for (int j = 0; j < arr.length ; j++) {
            System.out.println(arr[j]);
        }
        /*
        dog
        cat
        bear
         */

        // String[] split(String regex, int limit) 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다. 단, 문자열 전체를 지정된 수(limit) 로 자른다.
        String animals2 = "dog,cat,bear";
        String[] arr2 = animals2.split("," , 2);
        for (int j = 0; j < 2 ; j++) {
            System.out.println(arr2[j]);
        }
        /*
        dog
        cat,bear
         */

        // boolean startsWith(String prefix) 주어진 문자열(prefix)로 시작하는지 검사한다.
        String ss = "java.lang.Object";
        boolean bs = ss.startsWith("java"); // true
        boolean bs2 = ss.startsWith("lang"); // false

        // String substring(int begin)
        // String substring(int begin , int end)
        // 주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 얻는다. 이 때. 시작 위치의 문자는 범위에 포함되지만 끝 위치의 문자는 포함되지 않는다.

        String s14 = "java.lang.Object";
        String c14 = s14.substring(10); // Object
        String p14 = s14.substring(5, 9); // lang

        // String toLowerCase() String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
        String s15 = "Hello";
        String s15L = s.toLowerCase(); // hello

        // String toUpperCase() String인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다.
        String s15U = s.toUpperCase(); // HELLO

        // String trim() 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
        String s16 =  "     Hello World   ";
        String s17 = s16.trim(); // Hello World

        // static String valueOf() 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우 toString()을 호출한 결과를 반환한다.
        String bb = String.valueOf(true);  // "true"
        String cc = String.valueOf('a');   //  "a"
        String ii = String.valueOf(100);   //  "100"
        String l = String.valueOf(100L);   //  "100"
        String f = String.valueOf(10f);    //  "10.0"
        String d = String.valueOf(10.0);   //  "10.0"
        java.util.Date dd =
                new java.util.Date();
        String date =
                String.valueOf(dd);
        System.out.println(dd);              // Sun Dec 17 17:31:19 KST 2023

    }
}

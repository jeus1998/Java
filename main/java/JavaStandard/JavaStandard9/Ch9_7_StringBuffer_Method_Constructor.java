package JavaStandard.JavaStandard9;

// Ch9-19,20 StringBuffer클래스의 메서드
public class Ch9_7_StringBuffer_Method_Constructor {
    public static void main(String[] args) {

         // StringBuffer 생성자

         // StringBuffer()
         // 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.

         StringBuffer sb = new StringBuffer();
         System.out.println("sb : " + sb);  // sb :  // 빈 문자열 출력

        // StringBuffer(int length)
        // 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.

        StringBuffer sbLength= new StringBuffer(10);
        System.out.println("sbLength : " + sbLength);  // sbLength :  // 빈 문자열 출력

        // 빈 문자열 출력이유 : 인스턴스에 넣은 값 X

        // StringBuffer(String str)
        // 지정된 문자열 값(str)을 갖는 StringBuffer 인스턴스를 생성한다. 이 인스턴스는 (str의 길이 + 16) 을 가지는 인스턴스이다.

        StringBuffer sbstr = new StringBuffer("abc");
        System.out.println(sbstr);  // abc


        // StringBuffer 메서드

        // append
        // 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.
        // 반환타입이 StringBuffer여서 채이닝 방식으로도 사용이 가능하다.
        // StringBuffer append(boolean b)
        // StringBuffer append(char c)
        // StringBuffer append(char[] str)
        // StringBuffer append(double d)
        // StringBuffer append(float f)
        // StringBuffer append(int i)
        // StringBuffer append(long l)
        // StringBuffer append(Object obj)
        // StringBuffer append(String str)

        StringBuffer sbappend = new StringBuffer("abc");
        StringBuffer sbappend2 = sbappend.append(true);
        sbappend.append('d').append(10.0f);
        System.out.println(sbappend2); // abctrued10.0
        System.out.println(sbappend);  // abctrued10.0

        // int capacity()
        // StringBuffer 인스턴스의 버퍼크기를 알려준다. length()는 버퍼에 담긴 문자열의 길이를 알려준다.

        StringBuffer sbCapacity = new StringBuffer(100);
        sbCapacity.append("abcd");
        System.out.println(sbCapacity.length()); // 4
        System.out.println(sbCapacity.capacity()); // 100

        // char charAt(int index)
        // 지정된 위치(index)에 있는 문자를 반환한다.

        StringBuffer sbCharAt = new StringBuffer("abc");
        System.out.println(sbCharAt.charAt(2)); // c

        // StringBuffer delete(int start, int end)
        // 시작위치(start)부터 끝 위치(end) 사이에 있는 문자를 제거한다. 단 끝 위치에 있는 문자는 제외

        StringBuffer sbDelete = new StringBuffer("123456");
        sbDelete.delete(0,3); // 123 제거 -> 456
        System.out.println(sbDelete); // 456

        // StringBuffer deleteCharAt(int index)
        // 지정된 위치(index)의 문자를 제거한다.

        StringBuffer  sbDeleteCharAt = new StringBuffer("123456");
        sbDeleteCharAt.deleteCharAt(0); // 1 제거 -> 23456
        System.out.println(sbDeleteCharAt); // 23456

        // insert
        // 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가한다. pos는 0부터 시작
        // StringBuffer insert(int pos, boolean b)
        // StringBuffer insert(int pos, char c)
        // StringBuffer insert(int pos, char[] str)
        // StringBuffer insert(int pos, double d)
        // StringBuffer insert(int pos, float f)
        // StringBuffer insert(int pos, int i)
        // StringBuffer insert(int pos, long l)
        // StringBuffer insert(int pos, Object obj)
        // StringBuffer insert(int pos, String str)

        StringBuffer sbInsert = new StringBuffer("0123456");
        sbInsert.insert(4, '.'); // 0123.456
        System.out.println(sbInsert);

        // int length()
        // StringBuffer 인스턴스에 저장되어 있는 문자열의 길이를 반환한다.

        // StringBuffer replace (int start, int end, String str)
        // 지정된 범위 (start~end)의 문자들을 주어진 문자열로 바꾼다. end 위치의 문자는 범위에 포함 되지 않는다.

        StringBuffer sbReplace = new StringBuffer("0123456");
        sbReplace.replace(3, 6, "AB"); // 345->AB
        System.out.println(sbReplace); // 012AB6

        // StringBuffer reverse()
        // StringBuffer 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다.

        StringBuffer sbReverse = new StringBuffer("0123456");
        sbReverse.reverse();
        System.out.println(sbReverse); // 6543210

        // void setCharAt(int index, char ch)
        // 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다.

        StringBuffer sbSetCharAt = new StringBuffer("0123456");
        sbSetCharAt.setCharAt(6, '7'); // 6 -> 7
        System.out.println(sbSetCharAt); // 0123457

        // void setLength(int newLength)
        // 지정된 길이로 문자열의 길이를 변경한다. 길이를 늘리는 경우에 나머지 빈 공간을 널문자 '\u00000로 채운다.

        StringBuffer sbSetLength = new StringBuffer("0123456"); // 길이 7
        sbSetLength.setLength(6);
        System.out.println(sbSetLength); // 012345

        // String toString()
        // StringBuffer 인스턴스의 문자열을 String으로 반환
        // System.out.println()에 지금까지 자동으로 toString()을 호출하는 기능이 있어서 문자열로 나왔지만
        // 본래는 StringBuffer 객체(인스턴스)이므로 toString()을 사용해서 문자열로 변환해야 했다.

        // String substring(int start)
        // String substring(int start , int end)
        // 지정된 범위 내의 문자열을 String으로 뽑아서 반환한다. 시작 위치만 정하면 시작위치부터 문자열 끝까지 뽑아서 반환한다.

        StringBuffer sbsubstring = new StringBuffer("0123456");
        String str = sbsubstring.substring(3); // 3456
        System.out.println(str); // 3456
        String str2= sbsubstring.substring(3, 4); // 3
        System.out.println(str2); // 3

    }
}

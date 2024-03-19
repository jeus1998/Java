package JavaStandard.JavaStandard9;

/* 해시코드란?
해시 코드는 객체의 유일한 정수 값이다. 이 값은 보통 해시 함수를 사용하여 생성되며,
객체의 내용이나 상태를 대표하는 값으로 간주됩니다.

1. 해시 함수 (Hash Function): 해시 함수는 임의의 데이터를 특정 길이의 고정된 값으로 매핑하는 함수이다.
이때 매핑된 값이 해시 코드이다. 좋은 해시 함수는 서로 다른 입력에 대해 서로 다른 해시 코드를 생성하고,
비슷한 입력에 대해서는 다른 해시 코드를 생성하는 특성을 가져야 합니다.

2. 해시 코드 (Hash Code): 해시 코드는 해시 함수에 의해 생성된 값으로, 객체의 내용이나 상태를 나타냅니다.
자바의 hashCode() 메서드가 반환하는 것이 이 해시 코드입니다.

3. 용도 : 주로 해시 코드는 해시 테이블과 같은 자료 구조에서 객체를 식별하거나 빠르게 검색하기 위해 사용됩니다.
예를 들어 HashMap이나 HashSet 같은 컬렉션 클래스들은 객체를 저장하고 검색할 때 해시 코드를 사용하여 성능을
향상시킵니다.
 */

/* 자바의 정석 Ch9-4 hashCode()

- 객체의 해시코드(hash code)를 반환하는 메서드
- Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환한다.

public clas Obcet{
    ...
    public native int hashCode();
}

native? : OS의 메서드(C언어) 내용이 없다. 이미 OS에 작성되어 있는 메서드를 호출하기 때문이다.

 */

public class Ch9_4 {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.hashCode());    // 96354
        System.out.println(str2.hashCode());    // 96354

        /*
        String 클래스에서 객체의 주소가 아닌 iv를 비교하도록 오버라이딩 했다.
        - equals()를 오버라이딩하면, hashCode()도 오버라이딩해야 한다. 둘다 객체의 주소를 다루기 때문이다.
        - equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문
         */

        // 각각의 기존의 실제 객체 주소를 보고 싶다면?
        /*
        -System.identityHashCode(Object obj)는 Object 클래스의 hashCode() 와 동일
         */
        System.out.println(System.identityHashCode(str1));   // 1149319664
        System.out.println(System.identityHashCode(str2));   // 2093631819

    }
}

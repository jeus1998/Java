package JavaStandard.JavaStandard9;

// Ch9-25,26 래퍼(Wrapper)클래스
public class Ch9_9_WrapperClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);

        // Deprecated Constructor
        /*
          Integer i = Integer(100);
          Integer 클래스의 생성자 Integer(int)은 현재는 deprecated(사용이 권장되지 않음) 인텔리제이기준 컴파일 오류 발생
          대신 Integer.valueOf(int) 메서드를 사용하는 것이 좋습니다.

          Integer i = Integer.valueOf(100);
          Integer i2 = Integer.valueOf(100);
          코드에서 사용된 Integer 클래스의 인스턴스 생성은 자동으로 박싱(autoboxing)됩니다.
          이것은 자바 5부터 도입된 기능으로, 기본 타입과 그에 상응하는 래퍼 클래스 간의 변환을 자동으로 처리합니다.

          Integer i = 100; // Autoboxing
          Integer i2 = 100; // Autoboxing
          위와 같이 코드를 작성하면 더 간단하게 표현할 수 있습니다.
         */

        System.out.println("i==i2 ? "+(i==i2)); // true
        /*
        -128에서 127까지의 정수 값은 캐싱되어 동일한 객체를 참조하게 되므로 == 연산자로 비교해도 참이 됩니다.
        이 범위 안에 속하는 값을 가지고 객체를 생성할 때는 이미 생성된 객체를 재사용합니다.
        그렇기 때문에 -128부터 127까지의 값에 대해 == 연산자로 비교하면 true가 나오지만,
        범위를 벗어나는 값에 대해서는 새로운 객체를 생성하므로 == 연산자로 비교하면 false가 됩니다.
         */
        System.out.println("i.equals(i2) ? "+i.equals(i2)); // true equals는 내용비교 즉 true 오버라이딩 되어있다.
        System.out.println("i.comarteTo(i2)="+i.compareTo(i2)); // 왼쪽값 기준 같으면 : 0 크면 : 양수 작으면 : 음수

        System.out.println("MAX_VALUE="+Integer.MAX_VALUE); // + 20억 MAX_VALUE=2147483647
        System.out.println("MIN_VALUE="+Integer.MIN_VALUE); // - 20억 MIN_VALUE=-2147483648

        System.out.println("SIZE= "+Integer.SIZE+"bits"); // 32비트
        System.out.println("BYTES= "+Integer.BYTES+"bytes"); // 4 byte
        System.out.println("TYPE= "+Integer.TYPE); // int

    }
}

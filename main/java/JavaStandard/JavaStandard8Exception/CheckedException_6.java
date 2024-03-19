package JavaStandard.JavaStandard8Exception;

// 자바의 정석 ch8-10  checked예외, unchecked예외

/*
- checked예외 : 컴파일러가 예외 처리 여부를 체크 (예외 처리 필수)  Exception과 그 자손
- unchecked예외 : 컴파일러가 예외 처리 여부를 체크 안함(예외 처리 선택) RuntimeException과 그 자손
 */
public class CheckedException_6 {
    public static void main(String[] args) {
        // throw new Exception("고의로 함"); // 에러 발생
        throw new RuntimeException("고의로 함");
    }
}

/*
// throw new Exception("고의로 함"); // 에러 발생 이 부분은 예외 처리를 안 해서 컴파일 에러가 발생하고

throw new RuntimeException("고의로 함"); 이 부분은 예외 처리 필수가 아니어서 컴파일 에러는 발생 안 하지만
에러가 발생해서 프로그램이 비정상적으로 종료되는 런타임 에라가 발생한다.

 */
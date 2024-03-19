package JavaStandard.JavaStandard8Exception;

/* 프로그램 오류 종류
- 컴파일 에러(compile-time error): 컴파일 할 때 발생하는 에러
- 런타임 에러(runtime error): 실행 할 때 발생하는 에러

- Java의 런타임 에러의 종류
1. 에러(error) 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
2. 예외(exception) 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

- 논리적 에러(logical error): 작성 의도와 다르게 동작
 */

/* 컴파일러가 하는일
1. 구문체크
2. 번역
3. 최적화             int i = 3 + 5; --> int i = 8;
4. 생략된 코드 추가     ExceptionTest extends Object 모든 클래스는 조상인 Objects를 상속 받는다 생략된 코드인 extends Object 추가
 */

/* 메인 메서드
public static void main(String[]args){}
JVM이 프로그램을 실행할 때  main 메서드를 찾아 호출하게 합니다.
이 메서드는 문자열 배열을 매개변수로 받는다. 이 배열은 명령행 인수(command line arguments)를 포함한다.
프로그램을 실행할 때 명령행에 추가된 인수들은 이 배열에 저장되어 전달됩니다.
 */


public class ExceptionTest_1 {
    public static void main(String[]args){

        // system.out.println(args[0]);  --> 컴파일 에러 발생 system이 아닌 System'
        // 만약 명령행 인수를 추가 X 하고 run하면 --> 런타임 에러 발생
        // System.out.println(args[0]);

        /*
        명령행 인수(command line arguments)중 첫 번쨰를 출력하는 코드인데
        명령행 인수를 전달하지 않고 실행하니 배열 args가 비어 있기 때문에
        ArrayIndexOutOfBoundsException이 발생한다. 예외 처리가 없으므로 이 예외가 발생하면 프로그램이 비정상적으로 종료됩니다.

         인텔리제이에서 명령행 인수 넣는법
         우측 상단에서 Edit Configurations에 추가
         */

        System.out.println(args[0]);
        System.out.println(args[1]);

    }
}


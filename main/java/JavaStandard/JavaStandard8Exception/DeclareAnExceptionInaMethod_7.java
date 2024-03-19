package JavaStandard.JavaStandard8Exception;

// 자바의 정석 Ch8-11~12
/*
메서드에 예외 선언하기
- 예외를 처리하는 방법 : try-catch문(직접 처리하기), 예외 선언하기 (떠넘기기), 은폐하기 (빈 catch문)
- 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것( 예외 선언하기)

방법

void method() throws Exception1, Exception2, ... ExceptionN {  메서드에 예외 선언
        // 메서드 내용
}

예외를 발생시키는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws를 잘 구별하자.



 */
public class DeclareAnExceptionInaMethod_7 {
    public static void main(String[] args) throws Exception{ // JVM의 기본 예외 처리기에 떠넘기기
        // Ch8-12 메서드에 예외 선언하기 예제-1 + &
        method1();
        method11();
    }
    public static void method11() throws Exception{ // main 메서드로 예외 떠넘기기
        method22();
    }
    public static void method22() throws Exception{ // method11()으로 예외 선언하기(떠넘기기)
        throw new Exception();
    }
    public static void method1(){  // 예외 직접 처리하기 try-catch
        try {
            method2();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("test");
        }
    }
    public static void method2() throws Exception{ // 예외 선언하기
        throw new Exception("예외 테스트");
    }


}

/* fianlly 블럭
- 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다.
- try 블럭 안에 return문이 있어서 try 블럭을 벗어나갈 때도 finally 블럭이 실행된다.

코드의 중복을 제거

예시

예제 파일 설치를 하는 코드가 있다고 가정
try{
    startInstall();    // 설치 시작
    copyFiles();
    deleteTempFiles(); // 임시파일 삭제
}
catch (Exception e){
    e.printStackTrace();
    deleteTempFiles();
}
지금 보면 try-catch 블럭에서 deleteTemFiles() 메서드가 중복되었다. 이를 해결하기 위해 fianlly 블럭 활용

try{
    startInstall();    // 설치 시작
    copyFiles();
}
catch (Exception e){
    e.printStackTrace();
}
finally {
    deleteTempFiles(); // 임시파일 삭제
}

 */
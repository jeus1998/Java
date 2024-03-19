package JavaStandard.JavaStandard8Exception;

// 자바의 정석 Ch8-15~17 사용자정의예외 만들기, 예외 되던지기
/*

사용자정의예외 만들기

- 우리가 직접 예외 클래스를 정의할 수 있다.
- 1. 조상은 Exception과 RuntimeException중에서 선택

Exception은 필수 예외 처리 클래스 RuntimeException은 선택 예외 처리 클래스

- 2. String 을 매개변수로 하는 생성자를 필수로 만든다.

ex)
class MyException extends Exception{
     MyException(String msg){
         super(msg); // 조상인 Exception클래스의 생성자를 호출한다.
     }
]

예외 되던지기 exception re-throwing

- 예외를 처리한 후에 다시 예외를 발생시키는 것
- 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것

 */
public class CustomExceptions_8 {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch (Exception e){
            System.out.println("main메서드에서 처리되었습니다.");
        }
    }
    public static void method1() throws Exception{
        try{
            throw new Exception("예외 발생");
        }
        catch (Exception e){
            System.out.println("method1()에서 예외가 처리되었습니다.");
            throw e;     // 다시 예외를 발생시킨다.
        }
    }
}

class  MyException extends Exception { // 사용자정의예외
    MyException(String msg) {
        super(msg); // 조상인 Exception클래스의 생성자를 호출한다.
    }
}
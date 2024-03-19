package JavaStandard.JavaStandard8Exception;

// 자바의 정석 Ch8-7

// printStackTrace() 와 getMessage()

/*
printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메세지를 화면에 출력한다.
getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.


System.out.println(0/0); 에서 ArithmeticException이 발생하고 있다.
이렇게 예외가 발생하면 예외 객체가 생성된다. 예외 객체는 예외 정보가 들어있고
printStackTrace(), getMessage() 같은 메서드들로 예외 정보를 가져올 수 있다.
 */

public class ExceptionObject_3 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(0/0); // ArithmeticException 발생!
            System.out.println(3); // 실행 x
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("예외 메세지: " + ae.getMessage());
        }
        catch (Exception e){
            System.out.println(4);
        } // try-catch문 종료

        System.out.println(5);

    }
}
/* 출력 결과
1
2
예외 메세지: / by zero
5
java.lang.ArithmeticException: / by zero
	at JavaStandard.JavaStandard8Exception.ExceptionObject_3.main(ExceptionObject_3.java:22)

예외 객체 ae의 정보를 가져오는 메서드 getMessage(), printStackTrace()를 통해서
22번째줄에서 0으로 나누는( / by zero)에러가 발생했다고 메세지가 출력되고 있다.

여기서 의문!
printStackTrace() 메서드가  System.out.println("예외 메세지: " + ae.getMessage()); 코드 보다 먼저 실행 되는데
왜 출력은 맨 밑으로 나오는지?

https://stackoverflow.com/questions/23738725/is-printstacktrace-of-throwable-class-an-asynchronus
나중에 스트림 공부하고 참고해보기

 */
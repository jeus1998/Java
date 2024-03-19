package JavaStandard.JavaStandard8Exception;

/* exception handling
정의: 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
목적: 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
 */

/* try - catch
try{
     // 예외가 발생할 가능성이 있는 문장들을 넣는다.
   } catch (Exception1 e1){
     // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
   } catch (Exception2 e2){
     // Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
   } catch (ExceptionN eN){
     // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
   }

   if문과 달리, try 블럭이나 catch 불럭 내에 포함된 문장이 하나뿐이어도 괄호{}를 생략할 수 없다.

 */

public class ExceptionHandling_2 {
    public static void main(String[] args) {

        // 1. 예외가 발생하지 않은 경우 예시

        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(3);
        }
        catch (Exception e){
            System.out.println(4);
        } // try-catch의 끝
        System.out.println(5);

        /* 결과
         1
         2
         3
         5
         */

        System.out.println("------------------");

        // 2. 예외가 발생한 예시
        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2);
        }
        catch (ArithmeticException ae){
            System.out.println(3);
        } // try-catch의 끝
        System.out.println(4);

        /* 결과
         1
         3
         4
         */

        System.out.println("------------------");

        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0); // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
            System.out.println(4); // 실행되지 않는다.
        }
        catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        }
        catch (Exception e){  // ArithmeticException을 제외한 모든 예외가 처리된다.
            System.out.println("Exception");
        } // try-catch의 끝
        System.out.println(6);

         /* 결과
         1
         2
         3
         true
         ArithmeticException
         6
         */
    }
}

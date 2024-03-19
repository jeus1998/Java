package JavaStandard.JavaStandard11;

// 자바의 정석 11단원 스택과 큐 활용
import java.util.*;
public class Ex11_3 {
    public static void main(String[] args) {
        String test = "(1+1) * (2+2";
        Stack st = new Stack();

        // 수식 괄호 검사 Code
        try{
            for (int i = 0; i < test.length() ; i++) {
                if(test.charAt(i) == '('){
                    st.push(test.charAt(i));
                }
                else if(test.charAt(i) == ')'){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                System.out.println("올바른 수식입니다");
            }
            else{
                System.out.println("잘못된 수식입니다");
            }
        }
        catch (Exception e){ // EmptyStackException
            System.out.println("잘못된 수식입니다");
        }

    }
}

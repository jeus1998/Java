package JavaStandard.JavaStandard8Exception;

// 자바의 정석 Ch8-8

/* 멀티 catch 블럭
- 내용이 같은 catch 블럭을 하나로 합친 것(JDK1.7부터)

try{
       ...
}
catch (ExceptionA e){
    e.printStackTrace();
}
catch (ExceptionB e2){
    e2.printStackTrace();
}

하나로 합치기

try{
       ...
}
catch (ExceptionA e | ExceptionB e){
    e.printStackTrace();
}

catch 블럭 안의 내용이 동일하니 중복을 제거하기 위해서이다.

주의사항!
1)
멀티 catch 블럭을 사용할 때 부모와 자식 관계라면 사용하지 않는다 컴파일 에러가 발생한다.

try{
       ...
}
// catch (ParentException e | ChildException e){ // 에러!

catch (ParentException e){ // OK. 위의 라인과 의미상 동일
     e.printStackTrace();
}

2)

ExceptionA 클래스에 선언된 메서드는 ExceptionB 클래스에서는 호출 불가하기 때문에 이런 식으로 코드를 작성하면 안 된다.

try{
       ...
}
catch (ExceptionA | ExceptionB e){
     e.methodA();  // 에러! ExceptionA에 선언된 methodA()는 호출불가하다!
}

 */
public class MultiCatchBlock_4 {
    public static void main(String[] args) {

    }
}

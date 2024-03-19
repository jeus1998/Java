package JavaStandard.JavaStandard9;
/*
자바의 정석 Ch9-1~3 Object 클래스와 equals()

Ch9-2 equals(Object obj)

- 객체 자신(this)과 주어진 객체(obj)를 비교한다. 같은 true 다르면 false
- Object 클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)

 */
class Value extends Object{
    int value;

    Value( int value){
        this.value = value;
    }

    /* Object 클래스의 원래 equals 메서드

     public boolean equals(Object obj) {
           return (this == obj);   <-- 객체 주소를 비교한다.
        }
     */
    public boolean equals(Object obj){

        Value v = (Value)obj;

        if(this.value == v.value){
            return true;
        }
        else return false;
    }

}

public class Ch9_1 {
    public static void main(String[] args){
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1.equals(v2));
        /*
        서로 다른 두 객체는 항상 주소가 다르다.
        equals를 오버라이딩 안 하면 false
        euqals를 오버라이딩 하면 true value값을 비교하기 때문에
         */
    }
}
/*
두 객체의 value 값은 10으로 동일하다 이 값을 비교하려면 equals를 오버라이딩 해야한다.
 */
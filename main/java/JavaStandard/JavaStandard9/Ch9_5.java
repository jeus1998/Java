package JavaStandard.JavaStandard9;

import java.util.Objects;

/* Ch9-5~6 toString(), toString()의 오버라이딩

- toString() : 객체를 문자열(String)으로 변환하기 위한 메서드
Object 클래스의 toString() 메서드

public String toString(){
      return getClass().getName() + "@" + Integer.toHexString(hashCode());
}

getClass() : 설계도 객체  getName(): 클래스 이름 + "@" (at, 위치) +  toHexString( 16진수)  <--  hashCode() 객체 주소


 */
class Card{
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    // hashCode() 오버라이딩
    public int hashCode(){
        return Objects.hash(kind, number);
    }

    // equals() 오버라이딩
    public boolean equals(Object obj){
        if(!(obj instanceof Card))
            return false;
        return this.kind.equals(((Card) obj).kind) && this.number == ((Card) obj).number;
    }

    // toString() 오버라이딩
    public String toString(){
        return "kind : " + kind + ", number : " + number;
    }
}


public class Ch9_5 {
    public static void main(String[] args) {

        System.out.println(new Card().toString());
        System.out.println(new Card().toString());

        /*
        1. toStirng() 오버라이딩 x
        JavaStandard.JavaStandard9.Card@7cca494b
        JavaStandard.JavaStandard9.Card@7ba4f24f

        2. toString() 오버라이딩 o
        kind : SPADE, number : 1
        kind : SPADE, number : 1
         */

        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        /*
         true
        -1842861219
        -1842861219
         */
    }
}
/*
equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야한다. 규칙!
 */
package JavaStandard.JavaStandard9;

// 자바의 정석 Ch9-3

class Person{
    long id;

    public boolean equals(Object obj){

        if(!(obj instanceof Person))
            return false;
        else
            return this.id == ((Person)obj).id;
    }

    public Person(long id) {
        this.id = id;
    }
}
public class Ch9_3 {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(1);
        System.out.println(p1.equals(p2));
    }
}

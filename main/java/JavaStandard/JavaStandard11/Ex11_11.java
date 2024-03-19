package JavaStandard.JavaStandard11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + ":"+ age;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;
        Person tmp = (Person)obj;
        return name.equals(tmp.name) && age == tmp.age;
    }

    public int hashCode(){
        // return (name+age).hashCode();
        return Objects.hash(name, age);   // 똑같이 동작 int hash(Object,,, values); // 가변인자
    }
}
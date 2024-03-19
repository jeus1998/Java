package TheEssenceOfJava.Ch7;

// 자바의 정석 다형성 instanceof 연산자

/*
instanceof 중요점
참조변수가 어떤 타입인지 보다
참조변수가 가리키는 인스턴스의 타입이 중요하다!
 */


public class Ch7_26_instanceof {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car instanceof Car);
        System.out.println(car instanceof Upgrade_Car);
        System.out.println(car instanceof SmartCar);

        Upgrade_Car upgradeCar = new Upgrade_Car();
        System.out.println(upgradeCar instanceof Car);
        System.out.println(upgradeCar instanceof Upgrade_Car);
        System.out.println(upgradeCar instanceof SmartCar);

        SmartCar smartCar = new SmartCar();
        System.out.println(smartCar instanceof Car);
        System.out.println(smartCar instanceof Upgrade_Car);
        System.out.println(smartCar instanceof SmartCar);

        Upgrade_Car uc = new SmartCar();
        System.out.println(uc instanceof Car);
        System.out.println(uc instanceof Upgrade_Car);
        System.out.println(uc instanceof SmartCar);

        SmartCar sc = new SmartCar();
        Upgrade_Car sc2 = (Upgrade_Car) sc;
        // System.out.println(sc2.x); 에러 발생
    }
}
class Car{
}
class Upgrade_Car extends Car{
}
class SmartCar extends Upgrade_Car{
    int x;
}

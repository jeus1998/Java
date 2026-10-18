package StreamStudy;

import java.util.function.*;

/**
 * Java에서 제공하는 함수형 인터페이스
 * Supplier<T>
 * - 매개변수 없이 반환값 만을 갖는 함수형 인터페이스
 * - T get()을 추상 메소드로 갖는다.
 *
 * Consumer<T>
 * - 객체 T를 매개변수로 받아서 사용하며, 반환값은 없는 함수형 인터페이스
 * - void accept(T t);를 추상 메소드로 갖는다.
 * - andThen 메소드 제공 이를 통해 하나의 함수가 끝난 후 다음 Consumer를 연쇄적으로 이용할 수 있다.
 *
 * Function<T, R>
 * - 객체 T를 매개변수로 받아서 처리한 후 R로 반환하는 함수형 인터페이스다.
 * - R apply(T t)를 추상메소도로 갖는다.
 * - Function 또한 andThen을 제공하며, 추가적으로 compose를 제공하고 있다.
 * - compose는 andThen과 다르게 첫 번째 함수 실행 이전에 먼더 함수를 실행하여 연쇄적으로 연결해준다는 차이가 있다.
 * - identity 함수는, 이는 자기 자신을 반환하는 static 함수이다.
 *
 * Predicate<T>
 * - 객체 T를 매개 변수로 받아 처리한 후 Boolean을 반환한다.
 * - Boolean test(T t)을 추상 메소도로 갖고 있다.
 */
public class JavaFunctionalInterfaces {
	public static void main(String[] args) {
		System.out.println("Supplier----> ");

		// Supplier
		Supplier<String> supplier = () -> "Hello";
		System.out.println(supplier.get());

		System.out.println("Consumer ----> ");

		// Consumer
		Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
		consumer.accept("Hello World");
		consumer.andThen((str) -> System.out.println(str)).accept("Hello World");

		System.out.println("Function----> ");
		// Function
		Function<String, Integer> function = (str) -> str.length();
		System.out.println(function.apply("Hello World"));

		function.andThen((integer) -> {
			System.out.println(integer + 1);
			return integer;
		}).apply("Hello World");

		System.out.println(function.compose((str) -> str + "!!").apply("Hello World"));

		Function<String, String> identity = Function.identity();
		System.out.println(identity.apply("Hello World"));

		System.out.println("Predicate ----> ");
		Predicate<String> predicate = (str) -> str.startsWith("Hello");
		System.out.println(predicate.test("Hello World")); // true
		System.out.println(predicate.test("no")); // false
	}
}

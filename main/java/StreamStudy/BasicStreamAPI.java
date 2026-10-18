package StreamStudy;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 생성, 가공, 결과 만들기
 */
public class BasicStreamAPI {
	public static void main(String[] args) {
		// Collection -> Stream
		List<String> strList = Arrays.asList("a", "b", "c");
		Stream<String> stream = strList.stream();

		// Array -> Stream
		String[] strArray = {"a", "b", "c"};
		Stream<String> stream1 = Stream.of(strArray);
		Stream<String> stream2 = Arrays.stream(strArray);

		// 원시 스트림
		IntStream intStream1 = IntStream.of(1, 2, 3);
		IntStream intStream2 = Arrays.stream(new int []{1, 2, 3});

		// filter
		Stream.of("a", "b1", "c2")
			.filter(str -> str.length() == 1)
			.forEach(System.out::println);

		// map
		Stream.of("a", "b", "c", "D")
			.map(String::toUpperCase)
			.forEach(System.out::println);

		// sorted
		Stream.of(52, 43, 41, 21)
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);

		// distinct
		System.out.println(Stream.of("a", "b", "c", "a")
			.distinct()
			.count());

		// pick
		int result = IntStream.of(1, 2)
			.peek(System.out::println)
			.sum();

		// stream <-> 원시 stream
		IntStream.range(1, 10)
			.mapToObj(tar -> "value" + tar);

		Stream.of(1.0, 2.0, 3.0)
			.mapToInt(Double::intValue);
	}
}

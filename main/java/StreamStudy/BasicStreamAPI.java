package StreamStudy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 생성, 가공, 결과 만들기
 * 출처: https://mangkyu.tistory.com/114 (망나니 개발자)
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

		// 최종연산

		// min, max, average
		OptionalInt min = IntStream.range(1, 10).min();
		IntStream.range(1, 10).max().orElse(0);
		IntStream.of(1, 2, 3).average().ifPresent(System.out::println);

		// sum, count
		int sum = IntStream.range(1, 10).sum();
		long count = LongStream.range(1, 10).count();

		// collect(): 스트림의 최종연산, 매개변수로 Collector를 필요로 한다.
		// Collector: 인터페이스, collect() 메소드의 파라미터
		// Collectors: 클래스, static 메소드를 톨해 이미 정의된 Collector를 제공한다.
		List<Product> productList = Arrays.asList(
			new Product(23, "potatoes"),
			new Product(14, "orange"),
			new Product(13, "lemon"),
			new Product(23, "bread"),
			new Product(13, "sugar"));

		// Collectors.toList()
		List<String> productNames1 = productList.stream()
			.map(Product::name)
			.collect(Collectors.toList());

		List<String> productNames2 = productList.stream()
			.map(Product::name)
			.toList();

		// Collectors.joining()
		// potatoesorangelemonbreadsugar
		System.out.println(productList.stream()
			.map(Product::name)
			.collect(Collectors.joining()));

		// potatoes,orange,lemon,bread,sugar
		System.out.println(productList.stream()
			.map(Product::name)
			.collect(Collectors.joining(",")));

		// [potatoes,orange,lemon,bread,sugar]
		System.out.println(productList.stream()
			.map(Product::name)
			.collect(Collectors.joining(",", "[", "]")));

		// Collectors.averagingInt(), Collectors.summingInt()
		Double result1 = productList.stream()
			.collect(Collectors.averagingInt(Product::amount));
		Integer result2 = productList.stream()
			.collect(Collectors.summingInt(Product::amount));
		int result3 = productList.stream()
			.mapToInt(Product::amount)
			.sum();

		// Collectors.summarizingInt()
		IntSummaryStatistics statistics = productList.stream()
			.collect(Collectors.summarizingInt(Product::amount));
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getSum());
		System.out.println(statistics.getCount());

		// Collectors.groupingBy()
		Map<Integer, List<Product>> groupingBy = productList.stream()
			.collect(Collectors.groupingBy(Product::amount));
		System.out.println("groupingBy = " + groupingBy);

		// Collectors.partitioningBy()
		Map<Boolean, List<Product>> partitioningBy = productList.stream()
			.collect(Collectors.partitioningBy(product -> product.name().equals("orange")));
		System.out.println("partitioningBy = " + partitioningBy);

		System.out.println("Match Function----->");
		// Match
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		System.out.println(names.stream().anyMatch(name -> name.equals("Eric")));  // true
		System.out.println(names.stream().allMatch(name -> name.equals("Eric")));  // false
		System.out.println(names.stream().noneMatch(name -> name.equals("Eric"))); // false

		// forEach
		names.stream().forEach(System.out::println);

		// flatmap
		// [[a, b, c], [d, e]]
		List<List<String>> flatMapSampleData1 = Arrays.asList(
			Arrays.asList("a", "b", "c"), Arrays.asList("d", "e"));

		// [a, b, c, d, e]
		List<String> flatMapSampleResult1 = flatMapSampleData1
			.stream()
			.flatMap(Collection::stream)
			.toList();
		System.out.println("flatMapSampleResult1 = " + flatMapSampleResult1);

		String[][] flatMapSampleResul2 = new String[][]{{"a", "b", "c" }, {"d", "e"}};
		List<String> flatMapSampleResult2 = Arrays.stream(flatMapSampleResul2).flatMap(Arrays::stream)
			.toList();
		System.out.println("flatMapSampleResult2 = " + flatMapSampleResult2);

		Stream.of("Hello", "World")
			.map(w -> w.split(""))
			.flatMap(Arrays::stream)
			.distinct()
			.forEach(System.out::println);

		// reduce(accumulator)
		IntStream.range(1, 4)  // 1, 2, 3
			.reduce(Integer::sum).ifPresent(System.out::println);

		// reduce(identity, accumulator)
		System.out.println(IntStream.range(1, 4) // 1, 2, 3
			.reduce(-6, Integer::sum));  // 0

		// reduce(identity, accumulator)
		System.out.println("print reduce(identity, accumulator)");
		System.out.println(IntStream.range(1, 4) // 1, 2, 3
			.reduce(-6, (a, b) -> {
				System.out.println("a=" + a + ", b=" + b);
				return a + b;
			}));  // 0

		// reduce(identity, accumulator, combiner)
		Stream.of(1, 2, 3)
			.reduce(-6, Integer::sum, (a, b) -> {
				System.out.println("combiner call1");
				System.out.println(Thread.currentThread().getName());
				return a + b;
			});
		Stream.of(1, 2, 3)
			.parallel()
			.reduce(-6, Integer::sum, (a, b) -> {
				System.out.println("combiner call2");
				System.out.println(Thread.currentThread().getName());
				return a + b;
			});

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.parallel()
			.reduce(10,  Integer::sum, Integer::sum));

	}
}

record Product (
	int amount,
	String name
)
{}

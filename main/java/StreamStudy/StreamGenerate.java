package StreamStudy;

// 데이터 소스로부터 스트림을 생성해보자
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        // 컬렉션 데이터 소스 -> 스트림 생성           .stream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // 배열
        int [] intArr = {-1,1,0,0};
        Stream<Integer> stream2 = Arrays.stream(intArr).boxed();

        long [] longArr = {-1,1,0,0};
        Stream<Long> stream3 = Arrays.stream(longArr).boxed();

        String [] strArr = {"a", "b", "c"};
        Stream<String> stream4 = Stream.of(strArr);

        // 숫자
        // 임의의 수
        Stream<Integer> intStream = new Random().ints().boxed();
        IntStream intStream2 = new Random().ints();

        // IntStream intStream3 = new Random().nextInt();            // 에러
        IntStream intStream3 = IntStream.of(new Random().nextInt()); // 단일 정수 반환

        // 특정 범위의 연속된 정수
        IntStream intStream4 = IntStream.range(1, 5); // 1, 2, 3, 4
        Stream<Integer> intStream5 = IntStream.range(1, 5).boxed(); // 1  2  3  4
        IntStream intStream6 = IntStream.range(1, 1); // 1
        IntStream intStream7 = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5

        // 특정 범위의 난수
        // (streamSize, begin, end)
        IntStream intStream8 = new Random().ints(10 , 1, 10);

        // (begin , end)
        IntStream intStream9 = new Random().ints(1, 10);

        // 람다식
        Stream.iterate(0, n -> n + 2)
                .limit(4)
                .forEach(System.out::println); // 0, 2, 4, 6

        List<Integer> save;
        save = Stream.iterate(0, n -> n + 3)
                .limit(6).collect(Collectors.toList());

        List<Integer> save2 = new ArrayList<>();
        Stream.iterate(0, n -> n + 3)
                .limit(5).forEach(save2::add);

    }
}

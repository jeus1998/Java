package StreamStudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 최종 연산
public class StreamFinalOperation {
    public static void main(String[] args) {

        // 중간 연산까지 마친 스트림의 숫자를 차례대로 출력
        Stream.iterate(0, n -> n + 2).limit(6).forEachOrdered(
                n -> {
                    System.out.print(n);
                    System.out.print(" ");

                });
        System.out.println();
        /*
        0 2 4 6 8 10
         */

        // 조건 검사 allMatch(), anyMatch(), noneMatch()
        List<Integer> list = new ArrayList<>(List.of(11,12,13));
        System.out.println(list.stream().allMatch(Integer -> Integer > 10)); // true

        list.add(5);
        System.out.println(list.stream().allMatch(Integer -> Integer > 10 )); // false

        System.out.println(list.stream().anyMatch(Integer -> Integer < 5));   // false
        System.out.println(list.stream().anyMatch(Integer -> Integer <= 5));  // true

        System.out.println(list.stream().noneMatch(Integer -> Integer > 100)); // true
        System.out.println(list.stream().noneMatch(Integer -> Integer > 12));  // false

        // 조건 검사 findFirst(), findAny()
        List<Integer> list2 = new ArrayList<>(List.of(11, 12 ,13));
        Optional<Integer> result  = list2.stream().filter(Integer -> Integer > 10).findFirst();
        System.out.println(result.get()); // 11

        System.out.println(list2.stream().filter(Integer -> Integer > 12).findFirst().get()); // null
        System.out.println(list2.stream().filter(Integer -> Integer > 0).findAny().get()); // 11

        // collect(Collectors.toList()) 데이터를 수집해 리스트 형태로 변환
        List<String> names = List.of(
                "bae", "son", "park"
        );

        List<String> name = names.stream().collect(Collectors.toList());

        ArrayList<String> name_list = new ArrayList<>(name);
        name_list.add("yang");
        name_list.stream().sorted(new Comparator<String>(){
            public int compare(String o1, String o2){
                return -o1.compareTo(o2);
            }
        }).forEachOrdered(
                String -> {
                    System.out.print(String);
                    System.out.print(" ");
                }
        );
        System.out.println();

        // collect(Collectors.joining())

        List<String> check = List.of(
                "one",
                "two",
                "three"
        );
        String check_result = check.stream().collect(Collectors.joining(" "));
        System.out.println(check_result); // one two three

        // reduce(T identity, BinaryOperator<T> accumulator)
        int sum = IntStream.range(1, 6).reduce(0, (number1, number2) -> number1 + number2);
        int count = IntStream.rangeClosed(1, 5).reduce(0, (number1, number2) -> number1 + 1);
        System.out.println(sum);
        System.out.println(count);
        // reduce()의 첫번째 인자는 초기값을 의미
        /*
        count = 0 + 1 , 1 + 1 , 2 + 1 ... 5를 반환
        sum   = 0 + 1 , 1 + 2,  3 + 3 , 6 + 4, 10 + 5 = 15를 반환
        즉 IntStream.range(1, 6)으로 생성되는 인자값은 number2에 해당하고 number1은 초기값을 의미한다.
         */

        String make = IntStream.rangeClosed(1, 5).mapToObj(Integer::toString).reduce("", (str1, str2)-> str1+ str2);
        System.out.println(make); // 12345

        // IntStream을 활용한 sum
        int int_result = IntStream.rangeClosed(1, 100).sum();
        System.out.println(int_result);


        int int_result2 = IntStream.rangeClosed(1, 50).reduce(0, Integer::sum);
        System.out.println(int_result2);


    }
}

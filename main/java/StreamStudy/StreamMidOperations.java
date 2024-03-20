package StreamStudy;

import java.util.*;
import java.util.stream.*;

// 스트림 중간 연산 공부
public class StreamMidOperations {
    public static void main(String[] args) {
        // distinct()
        // 중복되는 데이터가 있는지 검사하고, 중복이 존재하면 예외를 던지는 코드
        List<String> players = new ArrayList<>();
        players.add("김현민");
        players.add("배제우");
        players.add("배제우");
        // 원래 players의 길이와 중복을 제거하고 players의 길이를 비교
        // -> 3 != 2 이니 예외 처리!
        if(players.size() != players.stream().distinct().count()){
            // throw new IllegalArgumentException("플레이어 이름은 중복될 수 없음!");
        }


        // filter()
        // 조건을 만족하는 데이터만 남기고 나머지는 제외하고 출력
        // 길이가 4인 문자열은 제외하고 길이가 4인 문자열만 출력
        List<String> test = new ArrayList<>();
        test.add("1234");
        test.add("12345");
        test.add("2345");
        test.add("a");
        test.add("abcd");
        test.stream().filter(String -> String.length() == 4).forEach(System.out::println);
        /*
        1234
        2345
        abcd
         */

        // sorted(Comparator<T> comparator) 기본 정렬 기준으로 정렬 역순으로 정렬 해보기
        List<String> crewNames = new ArrayList<>();
        crewNames.add("가"); crewNames.add("나"); crewNames.add("가나"); crewNames.add("가");
        crewNames.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        }).forEach(System.out::println);
        System.out.println("--------------");
        crewNames.stream().sorted().forEach(System.out::println);
        System.out.println("--------------");
        System.out.println(crewNames.stream().sorted().collect(Collectors.joining(" ")));

        class Person{
            private String name;
            private int age;
            public Person(String name, int age){
                this.name = name; this.age = age;
            }
            public String getName() {
                return name;
            }
            public int getAge() {
                return age;
            }
        }
        List<Person> persons = List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("BaeJewoo", 27)
        );
        // map(Function<T, R> mapper)
        // 원하는 필드만 뽑아내거나, 특정 형태로 변환
        List<String> names = persons.stream().map(Person::getName)
                .collect(Collectors.toList());

        names.stream().sorted().forEach(System.out::println);

        // flatMap(Function<T, R> mapper)
        // 중첩된 리스트 생성
        List<List<Integer>> numbers = Arrays.asList(
               List.of(1, 2, 3),
               List.of(4, 5, 6),
               List.of(7, 8, 9)
        );

        // 각 리스트들을 하나의 스트림으로 평탄화
        numbers.stream().flatMap(List :: stream).forEach(System.out::println);

        int [][] array2D = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list2D = Arrays.stream(array2D).flatMapToInt(Arrays :: stream).boxed().collect(Collectors.toList());
        System.out.println(list2D);
    }
}

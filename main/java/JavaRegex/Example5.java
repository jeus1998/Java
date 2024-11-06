package JavaRegex;

import java.util.regex.Pattern;

/**
 * 이메일 주소 예제
 *
 * ^: 문자열의 시작을 의미
 * 이메일 주소의 시작부터 일치하는지 확인
 *
 * $: 문자열의 끝을 의미
 * 이메일 주소의 끝까지 형싱이 맞는지 확인한다.
 *
 * [A-Za-z0-9+_.-]+
 * 알파벳 대소문자: A-Za-z
 * 0-9: 숫자
 * +_.-: +, _, ., - 특수 문자
 *
 * 대괄호([])는 문자 집합을 정의하는데 사용되며, 그 집합 내의 문자가 반복되는 경우 사용할 수 있다.
 * []+ : +는 사용자 이름 부분에 허용된 문자들이 한 개 이상 반복될 수 있음을 의미
 *
 * . 은 특수 문자이다. 그래서 역 슬레시를 사용하여 이스케이츠 처리한다. -> \\.
 *
 */
public class Example5 {
    public static void main(String[] args) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9]+\\.com$";
        System.out.println(Pattern.matches(regex, "baejeu@naver.com")); // true
        System.out.println(Pattern.matches(regex, "baejeu@naver_kakao.com")); // false
        System.out.println(Pattern.matches(regex, "@naver.com")); // false
        System.out.println(Pattern.matches(regex, "as_d12@google.com")); // true
        System.out.println(Pattern.matches(regex, "as_d@google")); // false
    }
}

package JavaRegex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Pattern.CASE_INSENSITIVE
 * 대소문자 구분 없이 찾기
 * 대소문자 구분 없이 특정 단어를 찾으려면 Pattern.CASE_INSENSITIVE 플래그를 사용한다.
 *
 * matcher.find()
 * 마치 iterator.hasNext() 같이 동작한다.
 * 문자열에서 정규표현식과 일치하는 부분을 찾을 때 사용된다.
 * 문자열애서 정규표현식과 일치하는 다음 위치를 찾을 때마다 true를 반환
 * 더 이상 일치하지 않으면 false 반환
 *
 * matcher.group()
 * matcher.group()는 가장 최근에 find()로 찾은 일치하는 문자열을 반환
 * 일치하는 문자열이 발견될 때마다 호출하여 해당 부분을 출력하거나 처리할 수 있다.
 * 특정 부분을 그룹화하는 정규식에서는 matcher.group(1), matcher.group(2) 등의 인덱스를 사용해
 * 그룹별로 일치하는 부분을 가져올 수 있다. 인덱스를 지정하지 않으면 전체 일치하는 문자열을 반환
 */
public class Example1 {
    public static void main(String[] args) {
        String text = "Hello, world , heLLO";
        String regex = "hello";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group()); // Hello, heLLO
        }
    }
}

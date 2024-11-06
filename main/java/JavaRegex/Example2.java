package JavaRegex;

import java.util.regex.*;

/**
 * 문자열 치환 - replaceAll
 * replaceAll을 사용하여 특정 패턴을 다른 문자열로 대체
 *
 * \\b 단어 경계
 * 특정 단어가 정확히 독립적인 단어로 존재할 때만 일치하도록 한다.
 */
public class Example2 {
    public static void main(String[] args) {
        String text  = "Apple is my favorite fruit. Apple is Delicious Appleee";
        String regex = "\\bApple\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("Banana");
        // Banana is my favorite fruit. Banana is Delicious Appleee
        System.out.println(result);
    }
}

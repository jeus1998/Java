package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 특정 URL 찾기
 * 프로그래머스 > 2019 KAKAO BLIND RECRUITMENT > 매칭 점수
 *
 * Greedy 매칭과 non Greedy 매칭
 * .* -> 어떤 문자든지 0번 이상 반복되는 패턴을 의미
 * 하지만 이 방식은 Greedy 매칭이다.
 * .*\" 이건 탐욕적 매칭인데 비탐욕적 매칭인 .*?\"와 같은 결과를 반환하지만
 * 최대한 많은 문자를 찾고 첫 번째 따옴표까지 반환과 첫 번째 따옴표를 찾으면 바로 멈추는 건 큰 차이이다.
 * 그러니 .*?\" 사용하자.
 *
 * https://[^\"]+
 * [^\"] : 이 부분은 "큰 따옴표(")를 제외한 모든 문자를 의미.
 * [ ]는 문자 집합을 나타내며, ^는 "부정"을 의미한다. 즉, " (큰 따옴표)가 아닌 모든 문자들만 매칭
 */
public class Example6 {
    public static void main(String[] args) {
        String text = "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        // 내가 찾고 싶은 url: <meta> 안에 있는 https -> homeUrl

        String regex1 = "<meta property=\"og:url\" content=\"https://.*?\"";
        String regex2 = "https://[^\"]+";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(text);

        if(matcher1.find()){
            System.out.println(matcher1.group()); // <meta property="og:url" content="https://careers.kakao.com/interview/list"
            String result = matcher1.group();
            Matcher matcher2 = pattern2.matcher(result);
            if(matcher2.find()){
                System.out.println(matcher2.group()); // https://careers.kakao.com/interview/list
            }
        }
    }
}

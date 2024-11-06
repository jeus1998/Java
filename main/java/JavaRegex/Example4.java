package JavaRegex;

import java.util.regex.*;

/**
 * 전화번호 추출 예제
 * 국내 전화번호 010-1234-5678 / 01-234-5678
 * \\d : 숫자와 일치한다 (0-9)
 * \\d{2,3}: 숫자 길이 2~3 의미
 */
public class Example4 {
    public static void main(String[] args) {
        String text  = "고객센터 연락처: 010-1234-5678, 보조 번호: 02-987-6543, 국내 번호x: 010-1234-56789";
        String regex = "\\b\\d{2,3}-\\d{3,4}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("전화번호 = " + matcher.group());
        }
    }
}
/* 출력
전화번호 = 010-1234-5678
전화번호 = 02-987-6543
 */
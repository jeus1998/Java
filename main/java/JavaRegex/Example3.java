package JavaRegex;

import java.util.regex.*;

/**
 * 특정 단어 포함 여부 확인
 * matcher.group()은 패턴에 일치하는 단어를 반환
 * matcher.start()는 패턴에 일치한 단어의 시작 index
 * matcher.end()는 패턴에 일치한 단어의 끝 반환 - 단어 포함 index + 1
 */
public class Example3 {
    public static void main(String[] args) {
        String text  = "Java is versatile and powerful.";
        String regex = "\\bversatile\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("찾은 단어: " + matcher.group());
            System.out.println("시작 위치: " + matcher.start());
            System.out.println("끝 위치: " + matcher.end());
        }
    }
}
/* 출력
찾은 단어: versatile
시작 위치: 8
끝 위치: 17
 */
package JavaStandard.JavaStandard10;

import java.util.Calendar;
import java.util.Date;

// 자바의 정석 Ch10-6~8 Calendar 예제2
public class Ch10_2_CalendarClass2 {
    public static void main(String[] args) {
        // - add()는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향O)
        Calendar date = Calendar.getInstance();
        date.clear(); // 모든 필드를 초기화
        date.set(2020, 7, 31); // 2020년 8월 31일로 설정

        date.add(Calendar.DATE, 1);   // 날짜(DATE)에 1을 더한다. -> 2020년 9월 1일
        System.out.println(new Date(date.getTimeInMillis()));
        date.add(Calendar.MONTH, -8); // 월(MONTH)에서 8을 뺀다.  -> 2020년 1월 1일
        System.out.println(new Date(date.getTimeInMillis()));

        // - roll()은 특정필드의 값을 증가 또는 감소(다른 필드에 영향X)
        date.set(2020, 7, 31); // 2020년 8월 31일 설정
        date.roll(Calendar.DATE, 1);    // 날짜(DATE)에 1을 더한다. -> 2020년 8월 1일
        System.out.println(new Date(date.getTimeInMillis()));
        date.roll(Calendar.MONTH, -8);  // 월(MONTH)에서 8을 뺀다.  -> 2020년 12월 1일
        System.out.println(new Date(date.getTimeInMillis()));
    }
}

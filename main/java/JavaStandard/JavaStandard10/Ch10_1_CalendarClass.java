package JavaStandard.JavaStandard10;

import java.util.Calendar;
import java.util.Date;

// Ch10-1~3 날짜와 시간 Calendar 클래스
public class Ch10_1_CalendarClass {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간으로 셋팅됨
        int thisYear = cal.get(Calendar.YEAR); // 올해가 몇년인지 알아낸다.
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막
        int today = cal.get(Calendar.DATE); // 오늘 일?
        System.out.println(thisYear);
        System.out.println(lastDayOfMonth);
        System.out.println(today);

        // Ch10-4,5 Calendar 예제

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2019, 3, 29); // 2019년 4월 29일

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println(difference/(24*60*60)); // 1일 = 24 * 60 * 60

        // - clear()는 Calendar객체의 모든 필드를 초기화
        Calendar dt = Calendar.getInstance(); // 현재시간
        System.out.println(new Date(dt.getTimeInMillis()));

        dt.clear();
        System.out.println(new Date(dt.getTimeInMillis())); // 1970년 1월 1일 00:00:00
        // EPOCH TIME

        // - clear(int field)는 Calendar객체의 특정 필드를 초기화
        Calendar dt2 = Calendar.getInstance();
        System.out.println(new Date(dt2.getTimeInMillis())); // Wed Dec 20 21:20:06 KST 2023

        dt2.clear(Calendar.SECOND); // 초를 초기화
        dt2.clear(Calendar.MINUTE); // 분을 초기화
        dt2.clear(Calendar.HOUR_OF_DAY); // 시간을 초기화
        dt2.clear(Calendar.HOUR); // 시간을 초기화

        System.out.println(new Date(dt2.getTimeInMillis())); // Wed Dec 20 12:00:00 KST 2023
    }
}

package TheEssenceOfJava.Ch7;

import java.util.Calendar;
import java.util.GregorianCalendar;

// 추상 클래스의 작성
// 추상화된 코드는 구체화된 코드보다 유연하다. 변경에 유리
public class Ch_34 {
    public static void main(String[] args) {
        // GregorianCalendar cal =  new GregorianCalendar(); // 구체적
        Calendar cal = Calendar.getInstance();               // 추상적
        /*
        if (aLocale.hasExtensions()) {
            String caltype = aLocale.getUnicodeLocaleType("ca");
            if (caltype != null) {
                cal = switch (caltype) {
                    case "buddhist" -> new BuddhistCalendar(zone, aLocale);
                    case "japanese" -> new JapaneseImperialCalendar(zone, aLocale);
                    case "gregory"  -> new GregorianCalendar(zone, aLocale);
                    default         -> null;
                };
            }
        }
        */

        /*
        첫 번째 코드는 서양력을 반환하는 코드
        두 번째 코드는 OS의 설정에 따라서 일본력 , 서양력, 불교력을 반환한다.
        내가 만약 일본에서 개발을 한다고 가정하면 첫 번째 코드로 구현이 되어 있으면 다시 코드를
        바꿔야 하지만 추상적으로 Calendar (추상 클래스)를 작성 해두면 OS에 맞게 알아서 달력을 반환한다.
        이게 추상화 클래스의 장점이다.
        */

    }
}

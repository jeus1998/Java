package JavaStandard.JavaStandard9;

// Ch9-23 Math 클래스의 메서드
public class Ch9_8_MathClass_Method {
    public static void main(String[] args) {
        // static double abs(double a)
        // static float  abs(float f)
        // static int abs(int f)
        // static long abs(long f)
        // 주어진 값의 절대값을 반환한다.

        int i = Math.abs(-10); // 10
        double d = Math.abs(-10.0); // 10.0
        System.out.println("i = " + i + ", " + "d = " + d);

        // static double ceil( double a) ceil = 천장
        // 주어진 값을 올림하여 반환한다.

        System.out.println(Math.ceil(10.1));  // 11.0
        System.out.println(Math.ceil(-10.1)); // -10.0
        System.out.println(Math.ceil(10.0000015)); // 11.0

        // static double floor (double a) floor = 바닥
        // 주어진 값을 버림하여 반환한다.

        System.out.println(Math.floor(10.8)); // 10.0
        System.out.println(Math.floor(-10.8)); // -11.0

        // static double max(double a, double b)
        // static float max (float a, float b)
        // static int max(int a, int b)
        // static long max(long a, long b)
        // 주어진 두 값을 비교하여 큰 쪽을 반환한다.

        System.out.println(Math.max(9.5, 9.5000001)); //  9.5000001
        System.out.println(Math.max(0, -1)); // 0

        // static double min(double a, double b)
        // static float min (float a, float b)
        // static int min(int a, int b)
        // static long minx(long a, long b)
        // 주어진 두 값을 비교하여 작은 쪽을 반환한다.

        System.out.println(Math.min(9.5, 9.5000001)); //  9.5
        System.out.println(Math.min(0, -1)); // -1

        // static double random()
        // 0.0~1.0 범위의 임의의 double값을 반환한다. (1.0은 범위에 포함되지 않는다.)

        double randomD = Math.random();  // 0.0 <= randomD <1.0
        int randomI = (int)(Math.random() * 10 ) + 1; //  1 <= randomI < 11
        System.out.println(randomI);

        // static double rint(double a)
        // 주어진 double값과 가장 가까운 정수값을 double형으로 반환한다. 단 두 정수의 가운데 있는 값(1.5, 2.5 ,,,)은 짝수를 반환
        System.out.println(Math.rint(1.2)); // 1.0
        System.out.println(Math.rint(2.6)); // 3.0
        System.out.println(Math.rint(3.5)); // 4.0
        System.out.println(Math.rint(4.5)); // 4.0

        // static long round(double a)
        // static long round(float a)
        // 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다. 두 정수의 정가운데있는 값은 항상 큰 정수를 반환
        System.out.println(Math.round(1.2)); // 1
        System.out.println(Math.round(2.6)); // 3
        System.out.println(Math.round(3.5)); // 4
        System.out.println(Math.round(4.5)); // 5

        //  static double pow(double a, double b)
        // 지정된 값을 지정된 거듭제곱 값으로 계산합니다. 즉, a^b를 반환합니다.
        // 이 메서드는 두 개의 매개변수를 받아서 첫 번째 매개변수를 두 번째 매개변수로 거듭제곱한 값을 반환합니다.

        double result = Math.pow(2, 3); // 2의 3승을 계산하여 결과는 8.0
        System.out.println(result);
        // static double sqrt(double a);
        // 지정된 값의 제곱근을 반환합니다. 즉, √a를 계산하여 반환합니다.

        double result2 = Math.sqrt(25); // 5.0
        System.out.println(result2);





    }

}

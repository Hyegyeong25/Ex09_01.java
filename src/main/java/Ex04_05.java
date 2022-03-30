public class Ex04_05 {
    public static void main(String[] args) {
        //객체 = 클래스
        String str = "111";
        int a = 100, b = 200;
        // 나머지 값 연산자 &
        // 정수 + 실수 = 실수
        // 대입연산자 => a += 100; / a -=100; *= /= %=
        // ++ : +1 / -- : -1
        // 전치(전위)증가 연산자 //후치(후위)증가 연산자
        System.out.printf("%d == %d 는 %s 이다. \n", a, b, a==b); //false
        System.out.printf("%d != %d 는 %s 이다. \n", a, b, a!=b); //true
        System.out.printf("%d > %d 는 %s 이다. \n", a, b, a>b); //false
        System.out.printf("%d < %d 는 %s 이다. \n", a, b, a<b); //true
        System.out.printf("%d >= %d 는 %s 이다. \n", a, b, a>=b); //false
        System.out.printf("%d <= %d 는 %s 이다. \n", a, b, a<=b); //true

        System.out.printf("%d = %d 는 %s 이다. \n", a, b, a = b); //200

    }
}

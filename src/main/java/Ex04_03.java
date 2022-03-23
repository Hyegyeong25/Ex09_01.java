public class Ex04_03 {
    public static void main(String[] args) {
        int a = 10;

        a++;
        System.out.printf("a++ ==> %d \n", a); // 11

        a--;
        System.out.printf("a-- ==> %d \n", a); // 10

        a+=5;
        System.out.printf("a+=5 ==> %d \n", a); // 15

        a-=5;
        System.out.printf("a-=5 ==> %d \n", a); // 10

        a*=5;
        System.out.printf("a*=5 ==> %d \n", a); // 50

        a/=5;
        System.out.printf("a/=5 ==> %d \n", a); // 10

        a%=5;
        System.out.printf("a%%=5 ==> %d \n", a); // 022.03.23
    }
}

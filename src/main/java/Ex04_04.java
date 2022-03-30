public class Ex04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++; // b = 10, a = 11
        System.out.printf("%d \n", b);

        b = ++a; // b = 12, a = 12
        System.out.printf("%d \n", b);
    }
}

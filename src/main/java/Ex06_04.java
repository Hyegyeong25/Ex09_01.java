import java.util.Scanner;

public class Ex06_04 {
    //스캐너 팩토리
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int factory = 1;
        System.out.printf("정수 입력 : " );
        int num = scan.nextInt();

        System.out.printf("%d \n", factory);
        for(int i = 1; i <= num; i++) {
            factory *= i;
            System.out.printf("for문 %d 번째 출력은 %d \n", i, factory);
        }

        System.out.println(factory);
    }
}

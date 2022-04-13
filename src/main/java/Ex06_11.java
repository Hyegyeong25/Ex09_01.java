import java.util.Scanner;

public class Ex06_11 {
    public static void main(String[] args) {

        int hap = 0;
        Scanner scan = new Scanner(System.in);

        //시작값이 끝보다 큰 수가 들어오면 " 시작값이 끝수보다 큽니다."
        //for문 실행 안되게

        System.out.print("시작 값 입력: ");
        int num1 = scan.nextInt();

        System.out.print("끝 값 입력: ");
        int num2 = scan.nextInt();

        System.out.print("증가 값 입력: ");
        int num3 = scan.nextInt();

        if(num1 > num2) {
            System.out.println("시작값이 끝수보다 큽니다.");
        } else {
            for (int i = num1; i <= num2; i += num3) {
                System.out.println(i);
                hap += i;
            }
            System.out.println("증가값의 합은 : "+hap);
        }
    }
}

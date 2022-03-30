import java.util.Scanner;

public class TermTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 01. 내가 입력한 숫자가 홀인지 짝인지 출력해주는 프로그램
        // 10 -> 짝입니다 / 11 -> 홀입니다
        /*
        System.out.print("숫자 입력 : ");
        int num = s.nextInt();

        if(num%2==0){
            System.out.println(num+" -> 짝입니다.");
        } else {
            System.out.println(num+" -> 홀입니다.");
        }
*/
        // 02. 내가 입력한 숫자가 3의 배수인지? 5의 배수인지? 3과 5의 배수인지?
        /*System.out.print("숫자 입력 : ");
        int multiple = s.nextInt();

        if((multiple%3==0) && (multiple%5==0)){ // a%3==15
            //3과 5의 배수
            System.out.println("3과 5의 배수입니다.");
        } else {
            if(multiple%3==0){
                System.out.println("3의 배수입니다.");
            } else if(multiple%5==0) {
                System.out.println("5의 배수입니다.");
            } else {
                System.out.println("3 또는 5의 배수가 아닙니다.");
            }
        }
*/
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요. \n");

        int n = sc.nextInt();
        boolean m = (n % 2 == 0);

        if (n % 2 == 0) {
            System.out.printf("짝입니다.");
        }else {
            System.out.printf("홀입니다.");
        }

    }
}

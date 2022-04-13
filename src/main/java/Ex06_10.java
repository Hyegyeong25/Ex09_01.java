import java.util.Scanner;

public class Ex06_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.print("값 입력 : ");
        num = scan.nextInt();

        for (i=0; i<=num; i++){
            hap += i;
        }
        i = 0;
        System.out.println(i+"부터 "+num+"까지의 합은 " + hap);
    }
}

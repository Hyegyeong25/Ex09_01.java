import java.util.Scanner;

public class Ex08_02_p {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // 배열 선언 + 초기화
        int[] a = new int[4];
        int hap = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
            hap += a[i];
        }
        System.out.println(hap);
    }
}

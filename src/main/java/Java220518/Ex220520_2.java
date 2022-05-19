package Java220518;

import java.util.Scanner;

public class Ex220520_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // charAt(i) : i번째 문자열을 갖고온다
        System.out.print("문자열 입력 => ");
        String str = scan.nextLine();

        System.out.print("출력 문자열 => ");
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='o'){
                System.out.printf("%c", '$');
            } else {
                System.out.printf("%c", str.charAt(i));
            }
        }
    }
}

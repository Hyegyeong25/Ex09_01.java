package Java220518;

import java.util.Scanner;

public class Ex220520_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // startsWith() : 처음 문자열을 읽고 true/false 반환
        // endsWith() : 끝 문자열을 읽고 true/false 반환

        System.out.print("문자열 입력 => ");
        String str = scan.nextLine();

        System.out.print("출력 문자열 => ");
        if(!str.startsWith("("))
            System.out.printf("(");
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i));
        }
        if(!str.endsWith(")"))
            System.out.printf(")");
    }
}

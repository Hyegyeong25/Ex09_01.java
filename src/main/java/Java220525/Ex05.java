package Java220525;

import java.util.Scanner;

public class Ex05 {
    /*public static int coffee_machine(int button){
        System.out.println("1. 자동으로 뜨거운 물을 준비한다.");
        System.out.println("2. 종이컵을 준비한다.");

        switch(button){
            case 1:
                System.out.println("3. 보통 커피를 탄다."); break;
            case 2:
                System.out.println("3. 설탕 커피를 탄다."); break;
            case 3:
                System.out.println("3. 블랙 커피를 탄다."); break;
            default:
                System.out.println("3. 아무거나 탄다."); break;
        }
        System.out.println("4. 물을 붓는다.");
        System.out.println("5. 스푼으로 저어서 녹인다.");

        return 0;
    }*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ex06 cff = new Ex06(); // new 객체 선언, 자바파일 전체를 올릴때
        //static은 함수단위로 올릴때!

        int coffee;
        int ret;

        System.out.print("어떤 커피를 탈까요? ");
        coffee = s.nextInt();

        ret = cff.coffee_machine(coffee);
        if(ret==0){
            System.out.println("커피 나왔습니다.(함수실행성공)");
        }
    }
}

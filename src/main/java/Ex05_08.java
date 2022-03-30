import java.util.Scanner;

public class Ex05_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int a = s.nextInt();
        /*
        if(a >= 90){
            System.out.println("A");
        } else if(a >= 80){
            System.out.println("B");
        } else if(a >= 70){
            System.out.println("C");
        } else {
            System.out.println("D");
        }*/
        int b = 100;
        if(a >= 90) {
            System.out.print("A");
        } else {
            if(a >= 80) {
                System.out.print("B");
            } else {
                if(a >= 70) {
                    System.out.print("C");
                } else {
                    if(a>=60) {
                        System.out.print("D");
                    } else {
                        System.out.print("F");
                    }
                }
            }
        }
        System.out.print(" 학점입니다. \n9");
    }
}

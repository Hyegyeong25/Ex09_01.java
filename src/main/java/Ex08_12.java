import java.util.Scanner;

public class Ex08_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] stack = new char[5];
        int top = 0;

        char carName = 'A';
        int select = 9;

        while (select != 3) {
            System.out.print("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 :");
            select = scan.nextInt();
            switch (select) {
                case 1 :
                    if(top == 5) {
                        System.out.println("터널이 꽉 차서 못 들어감.");
                    } else {
                        stack[top] = carName++;
                        System.out.printf("%c 자동차가 터널에 들어감 \n", stack[top]);
                        top++;
                    }
                    break;
                case 2 :
                    if(top == 0) {
                        System.out.println("빠져나갈 자동차가 없음.");
                    } else {
                        top--;
                    }
            }
        }
    }
}

package java220608;

import java.io.IOException;

public class java11_0613_2 {
    // 표준입출력 => 하나의 문자입력 : System.in.read()
    public static void main(String[] args) {
        String userName = "hanbit";
        String input = "";
        int key;

        try {
            System.out.print("이름 => ");
            while( (key = System.in.read()) != 10) {
                input += Character.toString((char)key);
            }
            if(userName.equals(input)) {
                System.out.println(input + "님 어서오세요");
            } else {
                System.out.println(input + "님 등록이 안되었습니다");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

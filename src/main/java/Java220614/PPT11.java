package Java220614;

import java.io.FileInputStream;
import java.util.Scanner;

public class PPT11 {
    //파일 입출력
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        /*FileWriter fw = new FileWriter("C:/Users/SAMSUNG/OneDrive/Desktop/자료/3.(수)프로그래밍언어실습/text0614.txt");
        String str;

        while( !(str = scan.nextLine()).equals("") )
            fw.write(str+"\r\n");
        fw.close();*/

    //C:\myJavaPRJ\src\main\java\Java220614\inoutstream
        FileInputStream fis = new FileInputStream("C:/myJavaPRJ/src/main/java/Java220614/inoutstream");
        int ch;
        while ( (ch = fis.read()) != -1) {
            System.out.print((char)ch);
        }
        fis.close();
    }
}

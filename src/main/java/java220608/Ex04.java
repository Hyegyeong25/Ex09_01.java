package java220608;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex04 {
    //Ex10_09 개념만 이해하자
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/SAMSUNG/OneDrive/Desktop/자료/3.(수)프로그래밍언어실습/tired.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); //한글 읽을 수 있게 해줌
        //utf-8, euc-kr
        int ch;
        while( (ch=isr.read()) != -1){
            //파일에서 문자 하나를 read()로 읽어온다. 파일의 끝일경우 -1을 반환함
            System.out.print((char)ch);
        }
        fis.close();
    }
}

package Java220518;

import java.util.Scanner;

public class Ex0518_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str, strRep, strSub;
        String[] strAry;

        System.out.print("문자열 입력 : ");
        str=scan.nextLine();

        strRep = str.replace(" ", "$");
        strSub = str.substring(3, 8);
        strAry = str.split(" ");

        System.out.println(strRep);
        System.out.println(strSub);
        for(int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열 "+i+" : "+strAry[i]);
        }
        // Access_log 서버 로그 샘플
        String log =  "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

    }
}

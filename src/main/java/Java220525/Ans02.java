package Java220525;

public class Ans02 {
    public static void main(String[] args){
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String[] item = log.split(" ");
        System.out.println("time : "+item[3]);
        //근데 값에 [가 붙어있어서 떼어주고 싶음
        String time = item[3].substring(1);
        System.out.println("time(자른버전) : "+time);


    }
}

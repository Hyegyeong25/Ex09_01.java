package java220608;

public class Ans01 {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String ip = log.substring(0, log.indexOf(" ")); //0~공백전까지
        System.out.println(ip);

        String time = log.substring(log.indexOf("[")+1, log.indexOf(" +"));
        System.out.println(time);

        System.out.println(sum(4, 2));

        /*
        String 객체 메모리에 올리는 방법 -> String name = new String("hyegyeong");
        Sum01을 메모리에 올리면 sum001이라는 이름으로 올라감
        new의 단점 : 클래스 전체를 올리기 때문에 내가 안쓰는 함수도 같이 메모리에 올라감
        */

        Sum01 sum001 = new Sum01();
        int result = sum001.sum(5,6);
        System.out.println(result);

        System.out.println(sum001.name);
    }
    public static int sum(int num1, int num2){
        //static 또는 class 만들어서 new 호출
        return num1 + num2;
    }
}
class Sum01{
    String name = "성현";
    public int sum(int num1, int num2){
        return num1 + num2;
    }
}
/*
* 힙 : 메모리에 올렸다 내렸다 자유자재 (= null로 초기화 해주는 것도 힙 메모리 공간인듯함)
* static : 한번 올리면 자바가 죽을때까지 죽지 않는 메모리
* new 클래스
* */

// new : 클래스 단위로 메모리에 올린다.
// Static : 함수,메소드,변수 단위로 메모리에 올린다.

// new 와 Static 의 차이
//  - 메모리에 저장되는 장소가 다르다
// new : heap 이라는 공간에 저장, 메모리에 올라가면 내 맘대로 메모리에 올라간 내용을 지울 수 있다.
// Static : Static 이라는 공간에 저장, 자바가 완전히 종료할 때까지 절대 안 사라짐.

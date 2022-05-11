import java.util.HashMap;
import java.util.Map;

public class Ex_09_MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //값 저장하기
        map.put("name", "주혜경");
        map.put("email", "2220110024@gspace.kopo.ac.kr");
        map.put("dept", "데이터분석과");

        //값 불러오기
        System.out.println("----------------------------------------");
        System.out.println("name : "+map.get("name"));
        System.out.println("email : "+map.get("email"));
        System.out.println("dept : "+map.get("dept"));
        System.out.println("----------------------------------------");
    }
}

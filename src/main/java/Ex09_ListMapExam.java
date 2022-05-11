import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex09_ListMapExam {
    public static void main(String[] args) {
        // 와! 2차원 배열보다 좋다!
        // List는 어떠한 객체도 다 저장 가능
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("name", "주혜경");
        map.put("email", "2220110024@gspace.kopo.ac.kr");
        map.put("address", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);

        map = null; //메모리의 데이터를 지우는 방식, 주혜경 정보 삭제

        // null 해버려서 선언 풀렸음, 기존 map 객체의 값을 새롭게 생성
        map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("address", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);

        int listSize = list.size();

        System.out.println("< 기본 출력 >");
        for(int i = 0; i < listSize; i++){
            Map<String, String> rMap = list.get(i);
            System.out.println("name : "+rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("address : "+rMap.get("address"));
            System.out.println("dept : "+rMap.get("dept"));
            System.out.println("-----------------------------");
        }

        System.out.println("< foreach문 >");
        for(Map<String, String> rMap : list){
            System.out.println("name : "+rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("address : "+rMap.get("address"));
            System.out.println("dept : "+rMap.get("dept"));
            System.out.println("-----------------------------");
        }

        System.out.println("< Lambda Expression >");
        list.forEach(rMap -> {
            System.out.println("name : "+rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("address : "+rMap.get("address"));
            System.out.println("dept : "+rMap.get("dept"));
            System.out.println("-----------------------------");
        });

        System.out.println("< Iterator >");

    }
}

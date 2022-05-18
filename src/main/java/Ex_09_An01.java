import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex_09_An01 {
    public static void main(String[] args) {
        List<Map<String, String>> list1 = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("dept", "데이터분석");

        list1.add(map);
        map = null;

        map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("dept", "정보보안");
        list1.add(map);
        map = null;

        list1.forEach(rMap -> {
            System.out.println(rMap.get("name"));
            System.out.println(rMap.get("dept"));
        });
    }
}

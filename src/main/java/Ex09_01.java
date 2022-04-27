import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("주혜경");
        list.add("임꺽정");
        list.add("홍길동");
        list.add("고길동");
        list.add("둘리");
        list.add("희동이");

        // List의 데이터 수 구하기
        int listSize = list.size();

        // List
        for(int i = 0; i < listSize; i++){
            System.out.println("이름 : "+ list.get(i));
        }
        
        System.out.println("While과 유사for문");
        for(String name : list){
            System.out.println("이름 : " + name);
        }

        // 최근 개발자들에게 인기 높은 컬렉션 객체를 조회하는 방법
        // 람다식, 자바 1.8 버전부터 많이 활용됨
        // 적용 가능한 경우가 제한적
        System.out.println("forEach");
        list.forEach(name -> System.out.println("name : "+name));

        System.out.println("Iterator");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : "+name);
        }
    }
}

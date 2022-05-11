import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09_01_p {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("김다운");
        list.add("김연");
        list.add("주혜경");
        list.add("최여진");

        int listSize = list.size();
        System.out.println("list의 데이터 수 : " + listSize);

        for(int i = 0; i < listSize; i++){
            System.out.println("이름("+i+") : "+ list.get(i));
        }
        System.out.println("--- foreach ---");
        for (String name : list){
            System.out.println("이름 : "+ name);
        }
        System.out.println("--- 람다식 ---");
        list.forEach(name -> System.out.println("name : "+ name));

        System.out.println("--- hasNext ---");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : "+name);
        }
    }
}

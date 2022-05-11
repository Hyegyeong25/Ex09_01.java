import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("주혜경");
        list.add("이협건");
        list.add("둘리");
        list.add("고길동");

        //foreach
        System.out.println("---------------- foreach ---------------- ");
        for(String name : list){
            System.out.println("name : "+name);
        }
        System.out.println("---------------- 람다 ---------------- ");
        //람다
        list.forEach(name -> System.out.println("name : "+name));
        //iterator
        System.out.println("---------------- Iterator ---------------- ");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println("name : "+name);
        }
    }
}

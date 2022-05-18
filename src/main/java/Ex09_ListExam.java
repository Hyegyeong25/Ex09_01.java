import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex09_ListExam {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("주혜경");
        list.add("김다운");
        list.add("김연");
        list.add("이정훈");
        list.add("최여진");

        int listSize = list.size();

        /*for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : "+list.get(i));
        }*/

        /*for (String name : list) {
            System.out.println("이름 : "+name);
        }*/

        //list.forEach(name -> System.out.println("name : "+name));

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름 : "+name);
        }

    }
}

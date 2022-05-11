import java.util.ArrayList;
import java.util.List;

public class Ex09_01 {
    public static void main(String[] args){
        List<String> pList = new ArrayList<>();

        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

        for(int i = 0; i < pList.size(); i++){
            System.out.println("이름 : "+ pList.get(i));
        }

    }
}

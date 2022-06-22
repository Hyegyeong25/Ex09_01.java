package Java0622;

import java.util.ArrayList;
import java.util.List;

public class Ex02_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("이협건");
        list.add("고길동");
        list.forEach(name -> System.out.println(name));
        Ex02_1 ex = new Ex02_1();

        System.out.println(ex.sum(1,2));
    }
    public int sum(int n1, int n2){
        return n1+n2;
    }
}

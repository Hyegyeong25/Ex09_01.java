public class Ex07_04 {
    public static void main(String[] args) {

        int a = 100;

        while(a == 200) {
            System.out.println("while문 내부");
        }

        do {
            System.out.println("Do - while문 내부에 들어왔습니다. \n");
        } while (a == 200);
    }
}

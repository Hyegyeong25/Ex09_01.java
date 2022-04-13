public class Exam0413 {
    public static void main(String[] args) {
        int hap = 0;

        for(int i = 1; i < 101; i++){
            if( (i % 3 == 0) || (i % 5 == 0)) {
                hap += i;
            }
        }

        System.out.println(hap);
    }
}

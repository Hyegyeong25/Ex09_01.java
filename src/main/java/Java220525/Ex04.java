package Java220525;

public class Ex04 {
    public static void main(String[] args) {
        int i = 1, j = 10;

        int k = sum(i, j);
        System.out.println(k);
    }
    public static int sum(int i, int j){
        int sum = 0;
        for (int k = i; k < j; k++) {
            sum+=k;
        }
        return sum;
    }
}

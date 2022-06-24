package Java0622;

public class EX03 {
    private String str = "문자";
    private int num = 0;
    private boolean type = true;
    public static void main(String[] args) {
        System.out.println("main 함수 호출 시작!!");

        int res = sum(1,2);

        System.out.println("sum 함수 실행 결과 : " + res);
        System.out.println("main 함수 호출 끝!!");
    }

    public static int sum(int i1, int i2){
        System.out.println("sum 함수 호출 시작!");

        int sum = 0;

        for (int i = i1; i < i2; i++)
            sum += 1;

        System.out.println("sum 함수 호출 끝!!");

        return sum;
    }
}

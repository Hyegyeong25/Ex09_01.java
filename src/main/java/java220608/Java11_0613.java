package java220608;

public class Java11_0613 {
    //11장 예외처리 복습
    public static void main(String[] args) {
        int[] aa = new int[3];

        try {
            aa[2] = 100/0; //0으로 나누는 에러
            aa[3] = 1000; // 인덱스 오버 에러
        } catch(ArithmeticException e) {
            System.out.println(e);
        }  catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }   catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("무조건 나옴");
        }
    }


}

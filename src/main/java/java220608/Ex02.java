package java220608;

public class Ex02 {
    //예외처리 기본 예 Ex10_01, 02, 03
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100; //크기 3의 배열 선언
        } catch (ArrayIndexOutOfBoundsException e) {
            //배열크기 에러 예외처리 구간
            System.out.println("배열 첨자가 배열 크기보다 커요~");
            //에러메시지
            System.out.println("에러 메시지 : "+e);
        } catch (ArithmeticException e) {
            System.out.println("수식오류~");
            //오류내용 출력
            System.out.println(e.getMessage());
        } finally {
            System.out.println("이 부분은 무조건 나와요~");
        }
    }
}

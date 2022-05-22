package Java220518;

public class Ex220522 {
    public static void main(String[] args) {
        String str = "자바를 공부하는 중, 자바는 재미있어!";
        System.out.println("문자열 ==> "+str);

        System.out.print("제일 처음 나오는 자바 위치 : ");
        System.out.println(str.indexOf("자바"));

        System.out.print("제일 마지막에 나오는 자바 위치 : ");
        System.out.println(str.lastIndexOf("자바"));
    }
}

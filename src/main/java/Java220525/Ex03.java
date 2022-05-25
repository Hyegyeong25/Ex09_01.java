package Java220525;

public class Ex03 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";
        String str3 = new String("Java Programming");

        System.out.println("원 문자열 ==> "+str1);
        System.out.println("원 문자열 ==> "+str2);
        System.out.println("원 문자열 ==> "+str3);

        System.out.println("문자열 1 == 문자열 2 결과 :"+str1==str2);
        System.out.println("문자열 1.equals(문자열 2) 결과 :"+str1.equals(str2));
        System.out.println("문자열 1 == 문자열 3 결과 :"+str1==str3);
        System.out.println("문자열 1.equals(문자열 3) 결과 :"+str1.equals(str3));

        System.out.println("문자열 1과 문자열2가 다른지 비교 compareTo 안쓰고, 이렇게 함: "+!str1.equals(str2));
    }
}

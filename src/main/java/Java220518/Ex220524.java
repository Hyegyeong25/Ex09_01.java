package Java220518;

public class Ex220524 {
    public static void main(String[] args) {
        String str = "   한글   ABCD   efgh   ";

        System.out.println("원 문자열 ==> ["+str+"]");
        System.out.println("대문자로 ==> ["+str.toUpperCase()+"]");
        System.out.println("소문자로 ==> ["+str.toLowerCase()+"]");
        System.out.println("공백제거 ==> ["+str.trim()+"]");

        //전체공백제거
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                result += str.substring(i, i+1);
            }
        }
        System.out.println("전체 공백제거 ==> ["+result+"]");

        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> ["+str1+"]");
        System.out.println("원 문자열2 ==> ["+str2+"]");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));
    }
}

public class Ex08_11 {
    public static void main(String[] args) {
        char[] stack = new char[5];
        int top = 0;


        for (int i = 0; i < stack.length; i++) {
            stack[top] = (char)('A'+i);
            System.out.printf("%c 자동차가 터널에 들어감 \n", stack[top]);
            top++;
        }
        System.out.println();
        for (int i = stack.length; i > 0; i--) {
            top--;
            System.out.printf("%c 자동차가 터널을 빠져나감 \n", stack[top]);
        }
    }
}

package Java0622;


class MyChild extends MyParent {
    @Override
    public int cal(int num1, int num2){
        return num1 * num2;
    }
    public static void main(String[] args) {
        MyChild c = new MyChild();
        int result = c.cal(2, 3);
        System.out.println("2 * 3 = " + result);
    }
}

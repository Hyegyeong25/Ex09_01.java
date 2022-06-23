package Java0622;


class MyChild extends MyParent {
    @Override
    public int cal(int num1, int num2){
        return num1 * num2;
    }
    public void main(){
        System.out.println("2 * 3 = " + cal(2,3));
    }
}
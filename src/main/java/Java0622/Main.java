package Java0622;

class Parent{
    int age;
    String name;
    public Parent(){
        System.out.println("Parent Default Constructor");
    }
    public Parent(int _age,String _name){
        age=_age;
        name=_name;
        System.out.println("Parent Constructor");
    }
    public void showInfo(){
        System.out.println("Name:"+name+", age:"+age);
    }
}

class Child extends Parent{
    public Child(int _age, String _name){
        super(_age,_name);
        System.out.println("Child Constructor");
    }
}
public class Main {

    public static void main(String[] args){
        Child a=new Child(25,"REAKWON");
        a.showInfo();
        MyChild c = new MyChild();
        c.main();
    }
}

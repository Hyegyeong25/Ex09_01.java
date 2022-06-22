package Java0622;

class Car{
    int speed = 0;
    void upSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재 속도(부모 클래스) : "+this.speed);
    }
    void downSpeed(int speed){
        this.speed -= speed;
        System.out.println("속도(부모) :"+this.speed);
    }
}

class Truck extends Car{
    void printT(){
        upSpeed(30);
    }
}

class Sedan extends Car{
    @Override
    void upSpeed(int speed){
        this.speed += speed;
        if(this.speed > 150){
            this.speed = 150;
            System.out.println("현재 속도(자식 클래스) : "+this.speed);
        }
    }
    @Override
    void downSpeed(int speed){
        this.speed -= speed;
        if(this.speed < 0){
            this.speed = 0;
            System.out.println("속도는 0보다 낮을 수 없음.");
        }
    }
}
public class Ex12_06 {
    public static void main(String[] args)
    {
        Truck t1 = new Truck();
        Sedan s1 = new Sedan();

        t1.upSpeed(200);
        s1.upSpeed(200);
        t1.downSpeed(250);
        s1.downSpeed(250);
        t1.printT();
    }
}

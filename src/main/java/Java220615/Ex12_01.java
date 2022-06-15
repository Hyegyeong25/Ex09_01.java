package Java220615;

class Car12 {
    String color;
    int speed;

    void upSpeed(int value) {
        speed += value;
    }
    void downSpeed(int value) {
        speed -= value;
    }
}
class sedan extends Car12 {
    int seatCnt;
    int getSeatNumber(){
        return seatCnt;
    }
}
class truck extends Car12 {
    int capacity;
    int getCapacity(){
        return capacity;
    }
}

public class Ex12_01 {
    public static void main(String[] args) {
        //인스턴스화, 클래스를 객체로 만드는 것.
        sedan sedan = new sedan();
        truck truck = new truck();

        sedan.upSpeed(150);
        truck.upSpeed(100);

        sedan.seatCnt = 5;
        truck.capacity = 8;


        System.out.println("세단 속도 : "+sedan.speed+" 좌석 수 : "+sedan.getSeatNumber());
        System.out.println("트럭 속도 : "+truck.speed+" 좌석 수 : "+truck.getCapacity());
    }
}

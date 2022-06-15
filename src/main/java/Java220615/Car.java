package Java220615;

class Car {
    private int speed = 0;
    Car(){
        System.out.println("print 출력"); 
    }
    public void upSpeed(int value) {
        if(speed + value > 200) {
            speed = 200;
        } else {
            speed += value;
        }
        System.out.println("현재 속도 ==> " + getSpeed());
    }
    int getSpeed() {
        return speed;
    }
}

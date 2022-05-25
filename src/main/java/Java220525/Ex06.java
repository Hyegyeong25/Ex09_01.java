package Java220525;

public class Ex06 {
    //함수따로만들기, 여긴 메인 없는 함수 작업 공간
    public int coffee_machine(int button){
        System.out.println("-----------------------------");
        System.out.println("1. 자동으로 뜨거운 물을 준비한다.");
        System.out.println("2. 종이컵을 준비한다.");

        switch(button){
            case 1:
                System.out.println("3. 보통 커피를 탄다."); break;
            case 2:
                System.out.println("3. 설탕 커피를 탄다."); break;
            case 3:
                System.out.println("3. 블랙 커피를 탄다."); break;
            default:
                System.out.println("3. 아무거나 탄다."); break;
        }
        System.out.println("4. 물을 붓는다.");
        System.out.println("5. 스푼으로 저어서 녹인다.");
        System.out.println("-----------------------------");
        return 0;
    }
}

public class Ex08_03 {
    public static void main(String[] args) {
        int aa[] = {100, 200, 300, 400, 500};
        int count, size;

        count = aa.length;
        size = count * Integer.BYTES; //int 타입은 4바이트 크기를 가짐

        System.out.println("int 크기 ㅣ "+Integer.BYTES);
        System.out.println("배열(count) 크기 ㅣ "+count);
        System.out.println("데이터(size) 크기 ㅣ "+size);

        for(int i = 0; i < aa.length; i++){
            System.out.println("aa["+i+"] : "+aa[i]);
        }
    }
}

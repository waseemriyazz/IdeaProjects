package harry;

public class CWH_24_Break_and_Continue {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){
            if (i==3){
                System.out.println("continue used here!");
                continue;
            }
            if (i==8){
                System.out.println("break used here!");
                break;
            }
            System.out.println(i);

        }
    }
}

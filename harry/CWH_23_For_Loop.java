package harry;
import java.util.Scanner;

public class CWH_23_For_Loop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number : ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                System.out.println(i);

            }
        }
    }
}

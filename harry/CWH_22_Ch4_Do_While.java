package harry;
import java.util.Scanner;


public class CWH_22_Ch4_Do_While {
    public static void main(String[] args) {
        int a=1,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        n = sc.nextInt();

        do {
            System.out.println(a);
            a++;
        }
        while (a<=n);
    }
}

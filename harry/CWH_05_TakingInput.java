package harry;
import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the two numbers is:");
        System.out.println(sum);
//        String str = sc.next();     Will scan one word or till first space
//        String str = sc.nextLine(); Will scan whole line
//        System.out.println(str);


    }
}

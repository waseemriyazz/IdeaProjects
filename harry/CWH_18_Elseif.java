package harry;
import java.util.Scanner;

public class CWH_18_Elseif {
    public static void main(String[] args) {
         int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You can legally marry now!");
            case 25 -> System.out.println("You should have a job by now!");
            case 60 -> System.out.println("You get to die soon or you're already dead!");
            default -> System.out.println("Chin up and chill, everything's gonna be alright");
        }
        System.out.println("Thanks for running (not ruining) my java code");

    }
}

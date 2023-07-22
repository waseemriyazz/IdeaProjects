package harry;
import java.util.Scanner;
public class CWH_19_Ch_4_Ps {
    public static void main(String[] args) {
//        Question 1
//            (=) means assignment
//            (==) means equal to
//        Question 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Science: ");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in Maths: ");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in Social Science: ");
//        m3 = sc.nextByte();
//        float avg = (m1 + m2 + m3) / 3f;
//        System.out.println("Average of three subjects is: " + avg);
//        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
//            System.out.println("Congratulations, You have passed!");
//        } else {
//            System.out.println("Better luck next time.");
//        }
//        Question 3
//         stupid program so skip
//        Question 4
        int a;
        System.out.println("Enter the serial number of day: \n" +
                "1 for monday and so on.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch (a){
            case 1 -> System.out.println("Monday.");
            case 2 -> System.out.println("Tuesday.");
            case 3 -> System.out.println("Wednesday.");
            case 4 -> System.out.println("Thursday.");
            case 5 -> System.out.println("Friday.(hehe)");
            case 6 -> System.out.println("Saturday.");
            case 7 -> System.out.println("Sunday.");
            default -> System.out.println("Incorrect number entered.");
        }
    }

}

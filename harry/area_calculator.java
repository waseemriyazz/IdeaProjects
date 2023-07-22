package harry;

import java.util.Scanner;

public class area_calculator {
    public static void main(String[] args) {
        System.out.println("Enter shape id");
        System.out.println("1 for circle");
        System.out.println("2 for square");
        System.out.println("3 for rectangle");
        System.out.println("4 for triangle");
        Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Enter the radius of circle:");
            int b = sc.nextInt();
            double c = 3.14*b*b;
            System.out.println("The area of circle is "+ c +" square units.");

        } else if (a==2) {
            System.out.println("Enter the length of side of square:");
            int b = sc.nextInt();
            int c = b*b;
            System.out.println("The area of square is "+ c + " square units.");

        } else if (a==3) {
            System.out.print("Enter the length of rectangle:");
            int b= sc.nextInt();
            System.out.print("Enter the breadth of rectangle:");
            int c= sc.nextInt();
            int d=b*c;
            System.out.println("The area of rectangle is "+d+" square units.");

        } else if (a==4) {
            System.out.print("Enter the base of triangle");
            int b= sc.nextInt();
            System.out.print("Enter the altitude of triangle");
            int c= sc.nextInt();
            double d= 0.5*b*c;
            System.out.println("The area of triangle is "+d+" square units.");

        } else if (a<1 || a>4) {
            System.out.println("Incorrect number entered madarchod ungli karna band kar");

        }
    }
}

package harry;
import java.util.*;

public class CWH_29_practice_set_6 {
    public static void main(String[] args) {
        // Question 1
        Scanner s = new Scanner(System.in);
        float[] arr = new float[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the value of number " + (i + 1) + ":");
            arr[i] = s.nextFloat();

        }
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        // Question 2

        System.out.println("Enter a number: ");
        float num = s.nextFloat();
        boolean IsInArray = false;
        for (float x : arr) {
            if (num == x) {
                IsInArray = true;
                break;
            }
        }
        if (IsInArray) {
            System.out.println("The entered number is present in the array!");
        } else {
            System.out.println("The entered number is not present in the array.");


        }
        //Question 3

        System.out.println("The value of average marks is "+ sum/arr.length);

        //Question 4
        int[][]mat1 = {{1,2,3}
                      ,{6,9,8}};
        int[][]mat2 = {{4,6,7}
                      ,{1,2,3}};
        int result [][] = new int[2][3];
        //Printing the elements of a two-dimensional array
        for (int i=0;i<mat1.length;i++){
            for (int j=0; j<mat1[i].length;j++){
                result[i][j]= mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}

package harry;
import java.util.Scanner;
public class CWH_16_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String str = sc.next();

      if (str.equalsIgnoreCase("hammad")){
          System.out.println("yaar-e-khas");
      } else if (str.equalsIgnoreCase("jibran")) {
          System.out.println("Roomie");
      } else if (str.equalsIgnoreCase("shahzaib")) {
          System.out.println("droke-peer");
      } else if (str.equalsIgnoreCase("zayaan")) {
          System.out.println("black man's white skinny slave");
      }else {
          System.out.println("beyond scope of this program");
      }
    }}





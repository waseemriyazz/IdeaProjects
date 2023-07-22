package harry;

public class CWH_17_logical_Operator {
    public static void main(String[] args) {
        boolean a = true,b=true,c=true;

        if (a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");}

            if (!a && b){
                System.out.println("Y");
            }
            else {
                System.out.println("N");

    }
        if (a && b ||!c){
            System.out.println("Y");
        }
        else {
            System.out.println("N");

        }
}}

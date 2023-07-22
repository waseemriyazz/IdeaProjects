package harry;

public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        int a=3;
        //Assignment Operators
        a *=3;
        System.out.println(a);
        a/=3;
        System.out.println(a);
        a+=3;
        System.out.println(a);
        a-=4;
        a*=10;
        System.out.println(a);
        // Modulo Operator
        int b=a%3;
        System.out.println(b);
        // Comparison Operators
        System.out.println(12>98);
        // Logical Operators
        System.out.println(12>98||98>12);
        // Bitwise Operators
        System.out.println(2&3);
        System.out.println(2|3);
    }
}

package harry;

public class CWH_09_Ch2_op_precedence {
    public static void main(String[] args) {
//        Precedence & Associativity
        int a= 6*5-34/2;
        /*
        30-34/2
        30-17
        13
         */
        int b= 60/5-34*2;
        /*
        12-34*2
        12-68
        -56
         */
        System.out.println(a);
        System.out.println(b);
/*        Quick quiz
       k = b*b - (4*a*c)/(2*a);
       v*v-u*u
       a*b-d
 */

    }
}

package harry;
public class CWH_12_Practice_Set_2_Problem_2 {
    public static void main(String[] args) {
        char grade ='B';
//        Encrypting the grade
        grade = (char) (grade + 8);
        System.out.println(grade);
//        Decrypting the grade
        grade = (char)(grade -8 );
        System.out.println(grade);
    }
}

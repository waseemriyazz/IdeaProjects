package harry;

public class CWH_27_array {
    public static void main(String[] args) {
        float [] marks = {1,2,3,4,5};
//        System.out.println(marks.length);
//        System.out.println(marks [3]);

//        String [] students = { "waseem", "hammad", "jibran", "shahzaib"};
//        System.out.println(students.length);
//        System.out.println(students[3]);
//       -----> Displaying and array
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
//            Displaying array in reverse order
            for (int j = marks.length-1;j>=0;j--){
                System.out.println(marks[j]);
        }
//            Displaying array using for each loop
        for (float x: marks){
            System.out.println(x);
        }
//        for ( datatype_of_array  variable : name_of_array){
//        System.out.println (variable); }

}
}

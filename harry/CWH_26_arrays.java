package harry;

public class CWH_26_arrays {
    public static void main(String[] args) {
        /*
        3 ways to create array in java
        i) declaration and memory allocation
        int [] marks = new int [5]
        ii) declaration and then memory allocation
         */
        int []marks ;
        marks= new int [5];
        marks[0]= 100;
        marks[1]= 65;
        marks[2]= 54;
        marks[3]= 90;
        marks[4]= 70;
        System.out.println(marks[3]);
        /*
        iii) declaration , memory allocation and initialization together
        int [] marks ={ 45,67,78,89,12};
         */
    }
}

package harry;

public class CWH_28_Multi_D_Arrays {
    public static void main(String[] args) {
        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

//        -----> Displaying and array
        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i);
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

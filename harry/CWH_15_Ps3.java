package harry;

public class CWH_15_Ps3 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Sheikh Hammad";
        name = name.toLowerCase();
        System.out.println(name);
        // Problem 2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println( text);
        // Problem 3
        String letter = " Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Waseem");
        System.out.println(letter);
        //Problem 4
        String myString = "THis string contains  double  and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        // Problem 5
        String myLetter = "Dear Waseem,\n\tkeep it up";
        System.out.println(myLetter);

    }
}

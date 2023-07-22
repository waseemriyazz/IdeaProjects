package harry;

public class CWH_14_String_Methods {
    public static void main(String[] args) {
        String name = "Waseem";
//        String a1 = new String("harry");
//        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString= "   WASeem    ";
        String trimmedString= nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('W', 'B'));
        System.out.println(name.replace("seem", "leed"));
        System.out.println(name.startsWith("W")); //use double quotes
        System.out.println(name.endsWith("W"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf("e", 4));
        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.equals("Waseem"));
        System.out.println(name.equalsIgnoreCase("waseeM"));
        // Escape sequence characters
        System.out.println("Escape sequence characters: \n");
        System.out.println("This is \\t \t.");
        System.out.println("This is \\b \b.");
        System.out.println("This is \\n \n.");
        System.out.println("This is \\r \r.");
        System.out.println("This is \\f \f.");
        System.out.println("This is \'.");
        System.out.println("This is \".");
        System.out.println("This is \\.");



    }
}


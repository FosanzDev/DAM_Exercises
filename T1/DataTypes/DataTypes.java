public class DataTypes {

    public static void main(String[] args) {
        
        byte as_char;               //Variable initialization
        byte as_num;                     
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b;

        as_char = 75;              //Value assign
        as_num = 120;                    
        s = 12000;
        i = 1200000000;
        l = 1200000000000000000l;
        f = 21.2332f;
        d = 1201231.3231231231;
        c = 'a';
        b = true;

                                            //Screen printing
        System.out.printf("""       
        Byte as a character = %c    (%d as a number)
        Byte as a number = %d
        short = %d
        integer = %d
        long = %d
        float = %f
        double = %f
        char = %c
        boolean = %b
        \n\n\n""", as_char, as_char, as_num, s, i, l, f, d, c ,b);


                                            //Screen printing 2nd method
    /*    System.out.println(
        "Byte as a character = " + (char)as_char + "    (" + as_char + " as a number)\n" +
        "Byte as a number = " + as_num + "\n" +
        "short = " + s              + "\n" +
        "integer = " + i            + "\n" +
        "long = " + l               + "\n" +
        "float = " + f              + "\n" +
        "double = " + d             + "\n" +
        "char = " + c               + "\n" +
        "boolean = " + b);

    */
    }
    

}
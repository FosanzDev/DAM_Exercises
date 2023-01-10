public class Ej6 {

    //returns cols x rows table 
    public static String charPrinter(char c, int cols, int rows){

        String s = "";
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                s += c;
            }
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(charPrinter('s', 20,5)); 
    }
}

public class Ej7 {
    public static void main(String[] args) {
        String str = "123456789";
        String reverse = "987654321";

        for(int i=1; i<10; i++){
            System.out.print(" ".repeat(9-i));
            System.out.printf("%s",str.substring(0,i));
            System.out.printf("%s",reverse.substring(9-i,9));
            System.out.println(" ".repeat(i));
        }
    }
}

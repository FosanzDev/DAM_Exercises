public class Ej4 {
    public static void main(String[] args) {
        String str = "123456789";
        for(int i=1; i<10; i++){
            System.out.printf("%s",str.substring(0,i));
            System.out.println(" ".repeat(i));
        }
    }
}

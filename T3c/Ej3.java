public class Ej3 {
    public static void main(String[] args) {
        String str = "123456789";
        for(int i=1; i<10; i++){
            System.out.printf("%9s\n",str.substring(0,i));
        }
    }
}
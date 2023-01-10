public class Ej8 {
    public static void main(String[] args) {
        for(int i=0; i<2; i++){
            for(int j=30; j<=37; j++){
                for(int k=40; k<=47; k++){
                    System.out.printf("\033[0;%dm\033[%d;%dm%d;%d;%d", i, j, k, i, j, k);
                    System.out.printf("\033[0m");
                }
                System.out.println();
            }
        }
    }
}
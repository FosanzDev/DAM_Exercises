import java.util.Random;

public class Ej13 {
    public static void main(String[] args) {
        //Variable definition
        Random rand = new Random();
        final int tiradas = 1000000;
        int cara = 0, cruz = 0;

        for(int i=0; i<tiradas; i++){
            boolean coin = rand.nextBoolean();
            if(coin) cara++;
            else cruz++;
        }

        double perc_cara = (float)cara/tiradas * 100;
        double perc_cruz = (float)cruz/tiradas * 100;

        System.out.printf("Caras: %d %.3f%%\n", cara, perc_cara);
        System.out.printf("Cruces: %d %.3f%%", cruz, perc_cruz);
    }
}

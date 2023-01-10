import java.util.Random;

public class Ej14 {
    public static void main(String[] args) {
        //Variable definition
        Random rand = new Random();
        final int tiradas = 1000000;
        int one = 0, two = 0, three = 0;
        int four = 0, five = 0, six = 0;

        for(int i=0; i<tiradas; i++){
            int dado = rand.nextInt(7);
            switch (dado) {
                case 1:
                    one++; break;
                case 2:
                    two++; break;
                case 3:
                    three++; break;
                case 4:
                    four++; break;
                case 5:
                    five++; break;
                case 6:
                    six++; break;
            }
        }

        double perc_one = (float)one/tiradas * 100;
        double perc_two = (float)two/tiradas * 100;
        double perc_three = (float)three/tiradas * 100;
        double perc_four = (float)four/tiradas * 100;
        double perc_five = (float)five/tiradas * 100;
        double perc_six = (float)six/tiradas * 100;

        System.out.printf("1: %d // %.3f%%\n", one, perc_one);
        System.out.printf("2: %d // %.3f%%\n", two, perc_two);
        System.out.printf("3: %d // %.3f%%\n", three, perc_three);
        System.out.printf("4: %d // %.3f%%\n", four, perc_four);
        System.out.printf("5: %d // %.3f%%\n", five, perc_five);
        System.out.printf("6: %d // %.3f%%\n", six, perc_six);
    }
}
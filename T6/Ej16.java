import java.util.Random;

public class Ej16 {
    public static void main(String[] args) {
        Random gen = new Random();

        double[] notas = new double[30];

        for(int i=0; i<30; i++){
            notas[i] = gen.nextDouble()*10;
        }

        double all = 0, pass = 0;
        int nPass = 0;

        for(double d : notas){
            if(d>=5){
                pass += d;
                nPass++;
            }
            all += d;
        }

        System.out.printf("Media de aprobados (%d entradas): %.2f\n", nPass, pass/nPass);
        System.out.printf("Media total: %.2f\n", all/30);
    
    }
}

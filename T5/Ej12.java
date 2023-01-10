import java.util.Random;

public class Ej12 {

    public static String analizeMark(double n){
        String s = "";
        if(n<5)
            s+="INSUFICIENTE";
        
        else if(n<6)
            s+="SUFICIENTE";

        else if(n<7)
            s+="BIEN";

        else if(n<9)
            s+="NOTABLE";
        
        else
            s+="EXCELENTE";
        
        s += String.format("(%.2f)", n);
        return s;
    }

    public static void main(String[] args) {
        Random gen = new Random();

        for(int i=0; i<50; i++){
            System.out.printf("Alumno %d:\t%S\n", i+1, analizeMark(gen.nextDouble(10.001)));
        }
    }
}
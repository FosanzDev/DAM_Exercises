import java.util.Random;

public class Ej11 {

    //Initializing a random generator
    public static Random gen = new Random();

    /**
     * Genera un numero entre 0 y 2
     * @return un entero (0, 1 o 2)
     */
    //Generating a random int from 0 to 2s
    public static int rand(){
        return gen.nextInt(3);
    }

    /**
     * Genera una quiniela (15 filas) indicando
     * el resultado de los partidos, devolviendo 1, X (empate) o 2 dependiendo del ganador
     * @return Un string con todas las filas separadas por \n
     */
    public static String genQuiniela(){ 
        //Defining the return string
        String s = "";

        for(int i=0; i<15; i++){

            //Adding info about the result
            s += String.format("Partido%d: \t", i+1);

            //Generate a random result and analizing
            int r = rand();
            switch(r){
                //Team 1 wins
                case 0:
                    s+="1";
                    break;
                    
                //Draw
                case 1:
                    s+="X";
                    break;
            
                //Team 2 wins
                case 2:
                    s+="2";
                    break;
            }
            
            //Adding line separator
            s+="\n";
        }

        //Returning the whole string
        return s;
    }

    public static void main(String[] args) {
        System.out.println(genQuiniela());
    }
}
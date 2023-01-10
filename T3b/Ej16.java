import java.util.Random;
import java.util.Scanner;



public class Ej16 {

    public static boolean comprobador(String s){
        if(s.charAt(0) == 's') return true;
        else return false;
    }

    public static int lanzar(){
        Random gen = new Random();
        return gen.nextInt(6)+1;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int porrasJ = 0, porrasM = 0;
        int PJ = 0, PM = 0;

        do {
            //Starting the game
            System.out.println("Presione intro para jugar, presione Ctrl+C para salir");
            lector.nextLine();
            System.out.println("¡Empecemos!");
            boolean wantsToPlay = true;
            boolean playerWins = false;
            boolean machineNeedsToPlay = true;

            //PLAYER TURN
            System.out.println("---ES TU TURNO---");

            while (wantsToPlay){
                //Printing info
                System.out.println("La suma de tus tiradas es " + PJ);

                //Checking if player wants to continue playing
                System.out.print("¿Lanzar dado? (s/n): ");
                if (comprobador(lector.nextLine())){
                    //Player wants to continue
                    int lanzamiento = lanzar();
                    System.out.println("Tu tirada: " + lanzamiento + " (Press Enter)");
                    //Waits for enter
                    lector.nextLine();
                    //Checks the results
                    PJ += lanzamiento;

                    //Case 1 -- Player gets max points
                    if (PJ == 11){
                        machineNeedsToPlay = false;
                        playerWins = true;
                        wantsToPlay = false;
                        System.out.println("¡Has obtenido la máxima puntuacion!");
                    }

                    //Case 2 -- Player points are more than the maximum 
                    else if (PJ > 11){
                        machineNeedsToPlay = false;
                        wantsToPlay = false;
                        System.out.println("¡Te has pasado!: " + PJ);
                    }

                    //Case 3 -- Player points are less than the maximum

                }
                else{
                    System.out.println("¡Te has plantado con " + PJ + " puntos!");
                    wantsToPlay = false;
                }
            }


            //MACHINES TURN

            //If player wins --> PJ = 11
            if(playerWins) porrasJ += 2;

            //If machine doesn't needs to play --> PJ > 11
            else if (!machineNeedsToPlay) porrasM += 1;

            //If machine needs to play and PJ < 11
            else{
                
            }

        System.out.println("FIN DE RONDA");
        System.out.println("Puntuaciones:");
        System.out.println("PJ // PM");
        System.out.printf("%d   %d\n",PJ, PM);
        System.out.println(porrasJ + " " + porrasM); 
        

        } while (true);
    }
}
/* Mini BlackJack game
 * FosanzDev 2022
 * 
 * Command-line based BlackJack game 
 */

import java.util.Random;
import java.util.Scanner;

public class Ej16b{
    public static Random gen = new Random();


    /**
     * Genera un numero aleatorio entre 1 y 6
     * @return un entero entre 1 y 6 
     */
    public static int dado(){
        return (gen.nextInt(6)+1);
    }


    //Aqui empieza la funciona main, con "throws InterruptedException". Esto Indica que 
    //habrá un momento en el que se interrumpira temporalmente la ejecucion del programa
    public static void main(String[] args) throws InterruptedException {

        //Definicion de variables
        Scanner lector = new Scanner(System.in);
        boolean wantsToPlay;

        //Primer do/while, indicando las partidas
        do{
            //Inicializamos valores para las variables propias de la partida
            int porrasJ = 0, porrasM = 0;
            boolean anotherRound = true;
            System.out.println("Enter para continuar Ctrl+C para salir");
            lector.nextLine();

            //Segundo do/while, indicando las rondas
            do {
                //Inicializamos valores para las variables propias de la ronda
                int PJ = 0, PM = 0;
                boolean plantado = false;
                boolean playerWins = false;

                System.out.println("-----NUEVA RONDA-------");
                System.out.println("TU TURNO");

                //Tercer do/while, indicando las tiradas del jugador
                do {
                    System.out.println("¿Quieres continuar? (s/n): ");

                    //Si no continua, el jugador se planta y el turno pasa a la máquina
                    if (lector.nextLine().charAt(0) == 'n'){
                        plantado = true;
                        System.out.printf("Te has plantado con %d puntos\n", PJ);                    
                    }

                    //Si continua, se tira un dado y se informa del resultado al jugador
                    else{
                        int tirada = dado();
                        PJ += tirada;
                        System.out.println("Resultado de la tirada: " + tirada);
                        System.out.println("Puntos totales: " + PJ);
                    }

                    //Se analizan la puntuacion por cada tirada del jugador

                    //Si se alcanza el 11, el jugador gana automaticamente 2 porras
                    if(PJ == 11){
                        porrasJ += 2;
                        System.out.println("Has conseguido la puntuación maxima");
                        playerWins = true; plantado = true;
                    }

                    //Si se supera el limite de 11, el jugador pierde automaticamente
                    else if(PJ > 11){
                        porrasM += 1;
                        System.out.println("Te has pasado!");
                        playerWins = false; plantado = true;
                    }
                    
                    System.out.println("");

                //El bucle se ejecutara mientras el jugador no se plante
                } while (!plantado);

                //En caso de que el jugador no haya ganado y su puntuacion sea menor a 11
                //La máquina entra en juego
                if(!playerWins && PJ < 11){
                    //Inicializamos variables propias a la logica de la máquina
                    boolean continues = true;

                    //Usando el metodo sleep hacemos una pequeña animacion
                    //Como si la máquina "pensara". Meramente estético
                    System.out.println("\nTURNO DE LA MÁQUINA");
                    System.out.print("La maquina esta jugando.");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println(".");
                    Thread.sleep(500);

                    //Este do/while corresponde a las tiradas de la máquina
                    do {
                        //Se lanza el dado y se analiza su puntuacion
                        PM += dado(); 

                        //Si la puntuacion de la maquina es menor a 11:
                        if(PM < 11 && PM  >= PJ){
                            //Se comprueba si supera o iguala al jugador, donde la maquina ganaria
                            continues = false;
                            porrasM += 1;
                            System.out.println("¡La máquina te ha ganado!");
                            System.out.println("Puntuacion de la maquina: " + PM);
                        }

                        //Si la puntuacion de la maquina es igual a 11:
                        //La máquina gana automaticamente 2 porras
                        else if (PM == 11){
                            porrasM += 2;
                            System.out.println("¡La máquina ha obtenido la máxima puntuacion!");
                            continues = false;
                        }

                        //En caso de que la maquina se pase, pierde automaticamente y 
                        // el jugador gana 1 porra
                        else{
                            porrasJ += 1;
                            System.out.println("La máquina se ha pasado!");
                            continues = false;
                        }

                    //El bucle se ejecuta mientras no cumpla ninguna de las anteriores interrupciones
                    // es decir, mientras no se supere ni al jugador ni el limite de 11
                    } while (continues);
                }

                //TERMINA LA RONDA

                //Se comprueba si el jugador o la máquina han superado las 5 porras
                if (porrasJ >= 5 ){
                    anotherRound = false;
                    System.out.println("\n¡El jugador ha ganado!\n\n");
                }

                else if (porrasM >= 5){
                    anotherRound = false;
                    System.out.println("\n¡La máquina ha ganado!");
                }

                //Se informa al jugador de las puntuaciones de la ronda
                System.out.println("\nPUNTUACIONES DE LA RONDA:");
                System.out.println("P1 // PC");
                System.out.printf("%d    %d\n\n", porrasJ, porrasM);

            //El bucle se ejecutará hasta que alguno supere los 5 puntos
            } while (anotherRound);

            //Se pregunta si el jugador quiere volver a jugar
            System.out.print("¿Volver a jugar? (s/n): ");
            if (lector.nextLine().charAt(0) == 's') wantsToPlay = true;
            else wantsToPlay = false;

        //Mientras el jugador quiera jugar, se reiniciará el juego
        } while(wantsToPlay);

        lector.close();
    }
} 
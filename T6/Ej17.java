import java.util.Scanner;
import t6lib.Utils;

public class Ej17{

	//Scanner creation
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args){

		//Variable definition
		System.out.print("Introduzca el numero de entradas: ");
		int n = lector.nextInt(); lector.nextLine();
		
		double[] estaturas = new double[n];

		for(int i = 0; i < n; i++){
			//Reads a double and saves it into an array with the n heigths
			double estatura = Utils.leerDouble("Introduzca una estatura: ");
			estaturas[i] = estatura;
		}

		//Calculating average
		double media = 0;
		for(double d : estaturas) media += d;
		media /= n;
		
		//Printing the average
		System.out.printf("La media de las estaturas es: %.2f\n", media);

		//Printing values above the average
		System.out.println("Superiores a la media: ");
		for(double d : estaturas) if (d >= media) System.out.print(d + " ");

		//Scanner closure ??
		lector.close();
		
	}
}
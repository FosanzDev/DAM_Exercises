import java.util.Random;
import t6lib.Utils;

public class Ej18 {
    
	public static void main(String[] args){
		//Creating a random generator and stablishing the limit
		Random gen = new Random();
		final int LIMIT = 10;

		//Creating the arrays
		int[] arrayUno = new int[LIMIT];
		int[] arrayDos = new int[LIMIT];

		//Filling the arrays with n numbers between 0-n
		for(int i=0; i<LIMIT; i++) arrayUno[i] = gen.nextInt(0, LIMIT+1);
		for(int i=0; i<LIMIT; i++) arrayDos[i] = gen.nextInt(0, LIMIT+1);
	
		//Printing of the results of the addition and division between both arrays
		for(int i : Utils.sumArray(arrayUno, arrayDos)) System.out.print(i + " ");
		System.out.println();
		for(double d : Utils.divArray(arrayUno, arrayDos)) System.out.printf("%.2f ", d);


	}
}

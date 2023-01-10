public class EsPar {
    public static void main(String[] args) {
        
	for (int i = 1; i <= 100; i++){		//i is taken for both iterating and calculating if it's even or odd
		
		System.out.print(i);			//print i value 
		
		if (i%2 == 0) System.out.println(" es un número par");		//then calculate parity and print consequently	
		else		  System.out.println(" es un número impar"); 

	}
	
    }
}

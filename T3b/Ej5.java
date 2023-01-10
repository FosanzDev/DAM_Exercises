public class Ej5 {
    public static void main(String[] args) {
        final int range = 100;
        int qOfOdds = 0, qOfEvens = 0, qOf5Mult = 0;        //q stands for quantity
        int sumOdds = 0, sumEvens = 0, sum5Mult = 0;

        //Checking numbers from 1 to range
        for(int i=1; i<=range; i++){

            //Getting evens
            if (i%2 == 0){
                qOfEvens += 1;
                sumEvens += i;
                System.out.print("\n" + i + " es par");
            }

            //Not even = odd
            else{
                qOfOdds += 1;
                sumOdds += i;
                System.out.print("\n" + i + " es impar");
            }

            //Checking if it's also multiple of 5
            if (i%5 == 0){
                qOf5Mult += 1;
                sum5Mult += i;
                System.out.print(" y además multiplo de 5");
            }
        }

        System.out.println("\n------------------------------------------------");
        System.out.println(qOfEvens + " números son pares");
        System.out.println(qOfOdds + " números son impares");
        System.out.println(qOf5Mult + " números son múltiplos de 5");
    }
}

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        double money;
        int intMoney;
        int eur1, c1;
        int eur2, c50, c20, c10, c5, c2;

        //Getting data
        System.out.print("Cuánto dinero tienes?: ");
        money = lector.nextDouble(); lector.nextLine();

        //Separating double into two integers
        money *= 100;
        intMoney = (int)money;
        eur1 = intMoney / 100;      //eur1 responds to quantity of euros
        c1 = intMoney % 100;        //c1 responds to quantity of cents

        //Processing data
        eur2 = eur1/2;
        eur1 %= 2;

        //Assign division, then change value to its remainder
        c50 = c1/50; c1 %= 50;      
        c20 = c1/20; c1 %= 20;
        c10 = c1/10; c1 %= 10;
        c5 = c1/5; c1 %= 5;
        c2 = c1/2; c1 %= 2;         //c1 will be the remainder of all math ops

        System.out.printf("""
        Necesitarás:
            - %d monedas de 2 euros
            - %d monedas de 1 euro
            - %d monedas de 50 c
            - %d monedas de 20 c
            - %d monedas de 10 c
            - %d monedas de 5 c
            - %d monedas de 2 c
            - %d monedas de 1 c
        """, eur2, eur1, c50, c20, c10, c5, c2, c1);

        //Lector close
        lector.close();
    }
}
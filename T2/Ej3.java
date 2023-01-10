public class Ej3{
    public static void main(String[] args) {
     
        final int PROD_PRICE = 85;       //Variable assignation
        final int DISCOUNT = 15;
        
        float finalPrice;

        //Monetary discount: (product price * discount%) / 100
        
        finalPrice = PROD_PRICE - (float)(PROD_PRICE*DISCOUNT) / 100;         //final price should result in a float

                                                                
        System.out.println("Original price: " + PROD_PRICE  + "e");         //Result printing
        System.out.println("Discount: " + DISCOUNT          + "%");
        System.out.println("Final price: " + finalPrice     + "e");
    }
}
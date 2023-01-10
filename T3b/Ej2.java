public class Ej2 {
    public static void main(String[] args) {
        int n = 1, sum = 0;

        while (n <= 1000){
            sum += n;
            n += 1;
        }

        System.out.println("Resultado final:" + sum);
    }
}

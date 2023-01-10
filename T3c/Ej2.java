import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int h, m, s;

        h = lector.nextInt();
        m = lector.nextInt();
        s = lector.nextInt();
        lector.nextLine();

        System.out.printf("%02d:%02d:%02d", h, m, s);

        lector.close();
    }
}

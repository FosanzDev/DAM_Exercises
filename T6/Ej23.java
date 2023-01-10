import t6lib.Utils;

public class Ej23 {
    public static void main(String[] args) {

        int[] v = Utils.genIntArray(10);

        int[] p = Utils.reverseArray(v);

        for (int i : v) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : p) {
            System.out.print(i + " ");
        }
    }
}

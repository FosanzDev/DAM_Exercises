import java.util.Random;

public class Ej19 {
    public static void main(String[] args) {
        Random gen = new Random();
        final int LIMIT = 100;
        int[] nums = new int[LIMIT];

        for (int i=0; i<LIMIT; i++){
            nums[i] = gen.nextInt(LIMIT+1);
        }

        pMult5(nums);
    }

    public static void pMult5(int[] n){
        for (int i : n){
            if (i%5 == 0) System.out.print(i + " ");
        }

        System.out.println();
    }
}

public class InsertionSort{
    
    public static void insertionSort(int[] array){
        int aux;
        int j;
        for (int i=1; i < array.length; i++){
            aux = array[i];
            j = i - 1;
            while (j >= 0 && aux < array[j]){
                array[j+1] = array[j];
                j--;
            }

        }
    }
    
    public static void main(String[] args) {
        
    }
}
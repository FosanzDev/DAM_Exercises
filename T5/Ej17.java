public class Ej17 {

    /**
     * Function that returns a rectangle with col x row size 
     * and each point is filled with a char
     * @param col number of cols
     * @param row number of rows
     * @param c char that is going to be used
     */
    public static void rectangulo(int col, int row, char c){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rectangulo(3, 3, 's');
    }
}
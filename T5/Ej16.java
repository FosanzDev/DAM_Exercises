public class Ej16 {

    /**
     * Function that prints a quadruple counter separated by
     * - and changes n int to i char
     * @param n integer that is going to be changed
     * @param l char that is going to be placed
     */
    public static void imprimir(int n, char l){
        char nchar = (char)(n+'0');
        for(int a=0; a<10; a++){
            for(int b=0; b<10; b++){
                for(int c=0; c<10; c++){
                    for(int d=0; d<10; d++){
                        //Creates a string for each line and replace values
                        String res = String.format("%d-%d-%d-%d", a,b,c,d);
                        System.out.println(res.replace(nchar, l));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        imprimir(9, 'a');
    }
}

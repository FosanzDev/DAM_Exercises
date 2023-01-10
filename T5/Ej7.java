public class Ej7 {
    
    public static long fact(int n){
        long foo = n;
        
        for(int i=1; i<n; i++)
            foo*=i;

        return foo;
    }
    
    public static void main(String[] args) {
        System.out.println(fact(40));
    }
}
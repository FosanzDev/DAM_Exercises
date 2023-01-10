public class Ej5 {
    public static void main(String[] args) {
        String str = "123456789";
        int code = 30;
        for(int i=1; i<10; i++){
            System.out.print(" ".repeat(9-i));
            System.out.printf("\033[0;%dm %s\n", code, str.substring(0,i) + "\033[0m");
            code += 1;
        }
    }
}

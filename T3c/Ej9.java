import java.util.Scanner;

public class Ej9{

    //Setting color codings
    public static final String RESET = "\033[0m";
    public static final String SET_BLUE_BG = "\033[44m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String RED = "\033[0;31m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String GREY = "\033[1;37m";

    public static void main(String[] args) {
        //Initializing variables
        Scanner lector = new Scanner(System.in);
        String ciudad;
        int dia, mes, año;
        int h, m, s;
        int viento, rain, uvi;
        double temp, press;

        String color;

        //Asking for the data
        System.out.print("Ciudad: ");
        ciudad = lector.nextLine();

        //Fecha is got from same line, separated by spaces
        System.out.print("Fecha (dd mm aaaa): ");
        dia = lector.nextInt();
        mes = lector.nextInt();
        año = lector.nextInt();
        lector.nextLine();

        //Hour is got from same line, separated by spaces
        System.out.printf("Hora (hh mm ss): ");
        h = lector.nextInt();
        m = lector.nextInt();
        s = lector.nextInt();
        lector.nextLine();

        System.out.print("Velocidad del viento: ");
        viento = lector.nextInt(); lector.nextLine();

        System.out.print("Temperatura: ");
        temp = lector.nextDouble(); lector.nextLine();

        System.out.print("Presion: ");
        press = lector.nextDouble(); lector.nextLine();

        System.out.print("Probabilidad de lluvia: ");
        rain = lector.nextInt(); lector.nextLine();

        System.out.print("Indice UV: ");
        uvi = lector.nextInt(); lector.nextLine();

        //Scanner closure
        lector.close();

        //Title printing
        System.out.printf(GREY + SET_BLUE_BG + "** DATOS ESTACION METEOREOLÓGICA **" + RESET + "\n");

        //Text is left padded by 25 spaces
        System.out.printf("%-25s%s\n", "Ciudad:", ciudad);
        System.out.printf("%-25s%02d/%02d/%d\n", "Fecha:", dia, mes, año);
        System.out.printf("%-25s%02d:%02d:%02d\n", "Hora de la mesura:", h, m, s);

        //Setting color depending on wind velocity
        if(viento<30)
			color = GREEN;
        else if (viento<60)
			color = YELLOW;
        else
			color = RED;
        System.out.printf("%-25s%s%d%s km/h\n", "Velocidad viento:", color, viento, RESET);

        //Setting color depending on temperature
        if(temp<22)
			color = BLUE;
        else if (temp<27)
			color = GREEN;
        else if (temp<35)
			color = YELLOW;
        else
			color = RED;
        System.out.printf("%-25s%s%.2f%s Cº\n", "Temperatura:", color, temp, RESET);

        //Pressure
        System.out.printf("%-25s%.1f hPa\n", "Presión atmosférica", press);

        //Setting color depending on rain probability
        if(rain<35)
			color = GREEN;
        else if (rain<70)
			color = YELLOW;
        else
			color = RED;
        System.out.printf("%-25s%s%d%s %%\n", "Probabilidad lluvia:", color, rain, RESET);

        //Setting color depending on UV Index
        if(uvi<=2)
			color = GREEN;
        else if(uvi<5)
			color = BLUE;
        else if(uvi<7)
			color = YELLOW;
        else if(uvi<10)
			color = RED;
        else
			color = PURPLE;
        System.out.printf("%-25s%s%d%s\n", "UVI:", color, uvi, RESET);
    }
}
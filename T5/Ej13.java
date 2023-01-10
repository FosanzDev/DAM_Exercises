import java.util.Scanner;

public class Ej13 {

    public enum Languages{
        VALENCIANO,
        CASTELLANO,
        INGLES,
        NONE
    }


    //Saludo dependiendo del idioma seleccionado
    /**
     * 
     * Devuelve un saludo personalizado en el idioma deseado
     * 
     * @param name Nombre en forma de string 
     * @param lang Lenguaje, tipo enum Languages
     * @return Un string con el saludo personalizado
     */
    public static String saludo(String name, Languages lang){

        String res = "";

        if(lang == Languages.VALENCIANO)
            res += "Bon dia " + name;
        
        else if(lang == Languages.CASTELLANO)
            res += "Buenos dias " + name;
        
        else if(lang == Languages.INGLES)
            res += "Good morning " + name;

        return res;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean valid = true;
        char charLang = '0';
        Languages lang;

        //
        System.out.println("Introduzca el nombre: ");
        String name = lector.nextLine();

        System.out.println("""
            Los idiomas disponibles son:
            a) Valenciano
            b) Castellano
            c) Inglés
                """);

        do {
            System.out.println("Introduzca una preferencia (a,b,c):");
            charLang = lector.nextLine().charAt(0);

            if(charLang == 'a'){
                lang = Languages.VALENCIANO;
                valid = true;
            }

            else if (charLang == 'b'){
                lang = Languages.CASTELLANO;
                valid = true;
            } 

            else if (charLang == 'c'){
                lang = Languages.INGLES;
                valid = true;
            } 
            
            else{
                valid = false;
                lang = Languages.NONE;
                System.out.println("Parametro no válido");
            }
                
 
        } while (!valid);

        System.out.println(saludo(name, lang));
        lector.close();
    }
}
package lib;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static Scanner lector = new Scanner(System.in);
    private static String vowels = "ÁÀÂÄÉÈËÊÍÌÏÎÓÒÔÖÚÙÜÛ";
    private static String normalv = "AEIOU";

    /**
     * Deploys an error on System.err and prints n args, then breaks the program
     * 
     * @param args Strings to be printed
     */
    public static void deployError(String... args) { 
        for (String s : args)
            System.err.println(s);

        System.exit(1);
    }

    /**
     * Receives an string and prints the number of vowels and consonants
     * <p>
     * Example:
     * <blockquote>
     * 
     * <pre>
     * count("Hola buenas")
     * // 5 vowels, 5 consonants
     * </pre>
     * 
     * </blockquote>
     * 
     * @param s String to be analized
     */
    public static void count(String s) {
        // Variable definition
        s = s.toUpperCase();
        int counter = 0;

        // Count the vowels
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1)
                counter++;
        }

        // Number of consonants = string length without spaces- number of vowels
        System.out.print(counter + " vocales");
        System.out.println(" y " + (s.replaceAll("\\s+", "").length() - counter) + " consonantes");
    }

    /**
     * Counts the number of words in a string
     * <p>
     * Example:
     * <blockquote>
     * 
     * <pre>
     * int n = countWords("Hola buenos dias");
     * // n = 3
     * </pre>
     * 
     * </blockquote>
     * 
     * @param s String with the words to be counted
     * @return Integer with the number of words
     */
    public static int countWords(String s) {
        // Example using arrays
        // String[] words = s.trim(). split("\\s+");
        // return words.length;

        // Using alternative method: counting whitespaces
        s = s.trim().replaceAll("\\s+", " ");
        if (s.equals(""))
            return 0;

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count++;
        }

        return count;
    }

    /**
     * Returns an array of Strings with the separated words of a phrase
     * <p>
     * Example:
     * <blockquote>
     * 
     * <pre>
     * String[] words = separateWords("Hola buenos dias")
     * //      words = ["Hola", "buenos", "dias"]
     * </pre>
     * 
     * </blockquote>
     * 
     * @param phrase String with the phrase
     * @return String array with the words
     */
    public static String[] separateWords(String phrase) {
        return phrase.trim().split("\\s+");
    }

    /**
     * Returns the longest String in an array
     * <p>
     * Example:
     * <blockquote>
     * 
     * <pre>
     * String s = getMaxLength("Hola", "Buenos", "Dias")
     * //    s = "Buenos"
     * </pre>
     * 
     * </blockquote>
     * 
     * @param args Undefinied number of Strings or an array
     * @return String with the longest word
     */
    public static String getMaxLength(String... args) {

        int maxValue = 0;
        int indexMax = 0;

        for (int i = 0; i < args.length; i++) {
            int len = args[i].length();
            if (len > maxValue) {
                maxValue = len;
                indexMax = i;
            }
        }

        return args[indexMax];
    }

    /**
     * Multiplies a String by n times
     * <p>
     * Example:
     * <blockquote>
     * 
     * <pre>
     * String s = multiplyString("hola", 3)
     * //    s = "holaholahola"
     * </pre>
     * 
     * </blockquote>
     * 
     * @param s     String to be multiplied
     * @param times N times that s will be multiplied
     * @return String with the multiplied String
     */
    public static String multiplyString(String s, int times) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++)
            sb.append(s);

        return sb.toString();
    }

    /**
     * Removes whitespaces and scape characters of a string
     * 
     * @param text String to be cleaned
     * @return The clean String
     */
    public static String cleanString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int idx = vowels.indexOf(text.charAt(i));
            if (idx == -1)
                sb.append(text.charAt(i));
            else
                sb.append(normalv.charAt(idx / 4));
        }
        text = sb.toString();
        return text.trim().replaceAll("\\s+", " ");
    }

    /**
     * Checks wether a String is palindrome or not (Ignores whitespaces and scape
     * characters)
     * 
     * @param text String with the text to be analized
     * @return Boolean with the response
     */
    public static boolean isPalindrome(String text) {
        text = cleanString(text).replaceAll("\\s+", "");
        int sep;
        int len = text.length();

        if (len % 2 == 0)
            sep = len / 2;
        else
            sep = len / 2 + 1;

        StringBuilder original = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < sep; i++)
            original.append(text.charAt(i));

        for (int i = len - 1; i > sep - 2; i--)
            reversed.append(text.charAt(i));

        String sOriginal = original.toString();
        String sReversed = reversed.toString();

        return sOriginal.equals(sReversed);
    }

    /**
     * Gets q alphanumeric number of chars over an String and saves it into a char
     * Array
     * 
     * @param s String with the alphanumeric characters
     * @param q Number of chars to be
     * @return char Array length q
     */
    public static char[] charDivider(String s, int q) {

        if (q > s.length())
            deployError("String length is below the divisor", "<Error at charDivider>");

        s = cleanString(s);
        char[] cArray = new char[q];

        for (int i = 0; i < q; i++) {
            cArray[i] = s.charAt(i);
        }

        return cArray;
    }

    /**
     * Reads and validates a double
     * 
     * @param msj String to be printed
     * @return Validated double
     */
    public static double leerDouble(String msj) {
        boolean valid;
        double d;
        do {
            d = 0;
            valid = true;
            System.out.print(msj);

            try {
                d = lector.nextDouble();
                lector.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida");
                lector.nextLine();
                valid = false;
            }

        } while (!valid);

        return d;
    }

    /**
     * Receives two integer arrays and returns another array of integers with the
     * length
     * equal to the min length of the two given arrays with the result of adding
     * values of the string by its index
     * 
     * @param a1 integer array one
     * @param a2 integer array two
     * @return integer array with the result of the additions
     */
    public static int[] sumArray(int[] a1, int[] a2) {
        int len = a1.length > a2.length ? a2.length : a1.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++)
            res[i] = a1[i] + a2[i];

        return res;

    }

    /**
     * Receives two integer arrays and returns another array of integer with the
     * length
     * equal to the min length of the two given arrays, with the result of the
     * division from both arrays by its index
     * 
     * @param a1 integer array with the dividends
     * @param a2 integer array with the divisors
     * @return double array with the result of the divisions
     */
    public static double[] divArray(int[] a1, int[] a2) {
        int len = a1.length > a2.length ? a2.length : a1.length;
        double[] res = new double[len];

        for (int i = 0; i < len; i++)
            res[i] = (double) a1[i] / a2[i];

        return res;

    }

    /**
     * Reads an integer with a personalized message
     * 
     * @param msj String with the message
     * @return Validated integer
     */
    public static int leerInt(String msj) {
        try (Scanner lector = new Scanner(System.in)) {
            int res = 0;
            boolean valid;

            do {
                System.out.println(msj);
                valid = true;
                try {
                    res = lector.nextInt();
                    lector.nextLine();
                } catch (InputMismatchException e) {
                    lector.nextLine();
                    System.out.println("Entrada no valida");
                    valid = false;
                }
            } while (!valid);

            return res;
        }

    }

    public static int[] genIntArray(int len) {
        Random gen = new Random();
        int[] res = new int[len];

        for (int i = 0; i < len; i++)
            res[i] = gen.nextInt();

        return res;
    }

    public static int[] genIntArray(int len, int limit) {
        Random gen = new Random();
        int[] res = new int[len];

        for (int i = 0; i < len; i++)
            res[i] = gen.nextInt(limit+1);

        return res;
    }

    public static int[] reverseArray(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i > 0; i--) {
            res[arr.length - 1 - i] = arr[i];
        }

        res[arr.length - 1] = arr[0];

        return res;
    }

}

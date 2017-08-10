package ch2.EverythingIsanObject;
/**
 * Create a class containing an int and a char that are not initialized,
 * and print their values to verify that Java performs default initialization.
 *
 * @author Andrey Koba
 */

public class E01_DefaultInitialization {
    static int i;
    static char c;

    public static void main(String[] args) {
        System.out.println("i = " + i);
        System.out.println("i = [" + c + "]");
    }
}

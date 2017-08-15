package ch3.operators;

/**
 * Show that hex and octal notations work with long values. Use
 * Long.toBinaryString( ) to display the results.
 *
 * @author Andrey Koba)
 */

public class E08_HexOctalNotations {
    public static void main(String[] args) {
        long hex = 0X14fffffffL;
        long octal = 0447;
        System.out.println("hex - " + Long.toBinaryString(hex));
        System.out.println("octal - " + Long.toBinaryString(octal));
    }
}

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
        long bin = 0b01101010101001010101010101010101;
        System.out.println("hex - " + Long.toBinaryString(hex));
        System.out.println("octal - " + Long.toBinaryString(octal));
        System.out.println("binary - " + bin);
    }
}

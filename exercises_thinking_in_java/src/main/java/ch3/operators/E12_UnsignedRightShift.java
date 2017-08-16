package ch3.operators;

/**
 * Start with a number that is all binary ones. Left shift it, then use the
 * unsigned right-shift operator to right shift through all of its binary positions, each time
 * displaying the result using Integer.toBinaryString( ).
 *
 * @author Andrey Koba)
 */

public class E12_UnsignedRightShift {
    public static void main(String[] args) {
        int a = 0x7;
        System.out.println(Integer.toBinaryString(a));

        a <<= 1;
        System.out.println(Integer.toBinaryString(a));

        for (int i = 0; i < 4; i++) {
            a >>>= 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}

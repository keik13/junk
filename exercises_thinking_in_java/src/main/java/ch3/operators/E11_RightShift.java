package ch3.operators;

/**
 * Start with a number that has a binary one in the most significant
 * position (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift
 * it all the way through all of its binary positions, each time displaying the result using
 * Integer.toBinaryString( ).
 *
 * @author Andrey Koba)
 */

public class E11_RightShift {
    public static void main(String[] args) {
        int a = 0x100;
        System.out.println(Integer.toBinaryString(a));

        for (int i = 0; i < 9; i++) {
            a >>>= 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}

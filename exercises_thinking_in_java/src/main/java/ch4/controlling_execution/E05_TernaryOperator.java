package ch4.controlling_execution;

/**
 * Repeat Exercise 10 from the previous chapter, using the ternary operator
 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 */
public class E05_TernaryOperator {
    public static void main(String[] args) {
        int a = 0x3;
        int b = 0x10;

        System.out.println("a - " + bitwiseTest(a));
        System.out.println("b - " + bitwiseTest(b));

        System.out.println("a >> b - " + bitwiseTest(a >> b));
        System.out.println("a << b - " + bitwiseTest(a << b));
        System.out.println("a >>> b - " + bitwiseTest(a >>> b));
        System.out.println("a & b - " + bitwiseTest(a & b));
        System.out.println("a | b - " + bitwiseTest(a | b));
        System.out.println("a ^ b - " + bitwiseTest(a ^ b));
        System.out.println("~a - " + bitwiseTest(~a));
        System.out.println("~b - " + bitwiseTest(~b));
    }

    static String bitwiseTest(int i) {
        int b = 0x1;
        StringBuilder s = new StringBuilder(32);
        while (i != 0) {
            s = s.append((i & b) == 0 ? "0" : "1");
            i >>>= 1;
        }
        return s.reverse().toString();
    }
}

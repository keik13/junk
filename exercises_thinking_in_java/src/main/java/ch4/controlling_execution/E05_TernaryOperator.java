package ch4.controlling_execution;

/**
 * Repeat Exercise 10 from the previous chapter, using the ternary operator
 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 */
public class E05_TernaryOperator {
    public static void main(String[] args) {
        int a = 0x10;
        int b = 0x01;

        System.out.println("a - " + bitwiseTest(a));
        System.out.println("b - " + bitwiseTest(b));
    }

    static String bitwiseTest(int i) {

        return "";
    }
}

package ch3.operators;

/**
 * Write a method that takes two String arguments and uses all the
 * boolean comparisons to compare the two Strings and print the results. For the == and !=,
 * also perform the equals( ) test. In main( ), call your method with some different String
 * objects.
 *
 * @author Andrey Koba)
 */

public class E14_CompareString {
    public static void main(String[] args) {
        compareString("abc", "bdf");
        compareString("abc", "abc");
        compareString(new String("abc"), new String("abc"));
    }

    static void compareString(String a, String b) {
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a.equals(b) " + a.equals(b));
        System.out.println("**************");
    }
}

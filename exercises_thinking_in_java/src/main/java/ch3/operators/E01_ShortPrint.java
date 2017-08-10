package ch3.operators;

/**
 * Write a program that uses the “short” and normal form of print statement.
 */
public class E01_ShortPrint {
    public static void main(String[] args) {
        System.out.println("normal print");
        print("short print");
    }

    static void print(String s) {
        System.out.println(s);
    }
}

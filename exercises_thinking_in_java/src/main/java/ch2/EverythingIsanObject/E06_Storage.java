package ch2.EverythingIsanObject;

/**
 * Write a program that includes and calls the storage( ) method defined as a code fragment in this chapter.
 *
 * @author Andrey Koba)
 */

public class E06_Storage {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println(new E06_Storage().storage("Hello"));
    }
}

package ch2.EverythingIsanObject;

/**
 * Turn the Incrementable code fragments into a working program.
 *
 * @author Andrey Koba)
 */

public class E07_Incrementable {
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class Incrementable {
    static void increment () { StaticTest.i++; }
}

class StaticTest {
    static int i =47;
}

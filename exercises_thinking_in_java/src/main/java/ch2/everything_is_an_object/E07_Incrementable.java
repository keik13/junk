package ch2.everything_is_an_object;

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

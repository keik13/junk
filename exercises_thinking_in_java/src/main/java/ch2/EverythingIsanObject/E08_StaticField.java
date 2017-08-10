package ch2.EverythingIsanObject;

/**
 * Write a program that demonstrates that, no matter how many objects you create of a particular class,
 * there is only one instance of a particular static field in that class.
 *
 * @author Andrey Koba)
 */

public class E08_StaticField {
    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        s1.i++;
        System.out.println(s1.i);
        StaticTest s2 = new StaticTest();
        System.out.println(s2.i);
    }
}


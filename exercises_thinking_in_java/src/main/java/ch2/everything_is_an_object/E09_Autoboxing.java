package ch2.everything_is_an_object;

/**
 * Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
 *
 * @author Andrey Koba)
 */

public class E09_Autoboxing {

    public static void main(String[] args) {
        Boolean bbo = true;
        boolean bb = bbo;

        Character co = 'a';
        char c = co;

        Byte bo = 1;
        byte b = bo;

        Short so = 2;
        short s = so;

        Integer io = 3;
        int i = io;

        Long lo = 4L;
        long l = lo;

        Float fo = 1.2f;
        float f = fo;

        Double ddo = 3.3;
        double d = ddo;

        System.out.println("primitive types - " + "bb=" + bb + " c=" + c + " b=" + b
                + " s=" + s + " i=" + i + " l=" + l + " f=" + f + " d=" + d);
        System.out.println("wrappers - " + "bbo=" + bbo + " co=" + co + " bo=" + bo
                + " so=" + so + " io=" + io + " lo=" + lo + " fo=" + fo + " ddo=" + ddo);

    }
}

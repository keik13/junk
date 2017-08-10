package ch3.operators;

/**
 * Create a class containing a float and use it to demonstrate aliasing.
 */
public class E02_Aliasing {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        b1.f = 3.0f;
        b2.f = 4.2f;

        System.out.println("b1.f=" + b1.f + " b2.f=" + b2.f);

        b1 = b2;

        System.out.println("b1.f=" + b1.f + " b2.f=" + b2.f);

        b1.f = 5.3f;

        System.out.println("b1.f=" + b1.f + " b2.f=" + b2.f);
    }
}

class Bank {
    float f;
}

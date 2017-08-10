package ch3.operators;

/**
 * Create a class containing a float and use it to demonstrate aliasing during method calls.
 */
public class E03_AliasingMethod {
    static void changeAccount(Account a) {
        a.f = 27.5f;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.f = 4.1f;
        System.out.println("a.f=" + a.f);

        changeAccount(a);
        System.out.println("a.f=" + a.f);
    }
}

class Account {
    float f;
}

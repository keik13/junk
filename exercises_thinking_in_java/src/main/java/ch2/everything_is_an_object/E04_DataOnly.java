package ch2.everything_is_an_object;

/**
 * Turn the DataOnly code fragments into a program that compiles and runs.
 *
 * @author Andrey Koba
 */

public class E04_DataOnly {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.і = 47;
        data.d = 1.1;
        data.b = false;
    }
}

class DataOnly { int і; double d; boolean b;}

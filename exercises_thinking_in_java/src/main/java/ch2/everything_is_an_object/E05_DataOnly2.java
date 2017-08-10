package ch2.everything_is_an_object;

/**
 * Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main( ).
 *
 * @author Andrey Koba)
 */

public class E05_DataOnly2 {
    public static void main(String[] args) {
       DataOnly dataOnly = new DataOnly();
        dataOnly.і = 47;
        dataOnly.d = 1.1;
        dataOnly.b = false;

        System.out.println("i=" + dataOnly.і + " d=" + dataOnly.d + " b=" + dataOnly.b);
    }

}

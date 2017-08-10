package ch2.EverythingIsanObject;

/**
 * Write a program that prints three arguments taken from the command line.
 * To do this, you’ll need to index into the command-line array of Strings.
 *
 * @author Andrey Koba)
 */

public class E10_CliArguments {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(args[i]);
        }
    }
}

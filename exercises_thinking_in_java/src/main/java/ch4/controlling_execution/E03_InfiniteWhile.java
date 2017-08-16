package ch4.controlling_execution;

import java.util.Random;

/**
 * Modify Exercise 2 so that your code is surrounded by an “infinite” while
 * loop. It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
 */
public class E03_InfiniteWhile {
    public static void main(String[] args) {
        Random r = new Random();

        int a1 = r.nextInt(100);
        while (true) {
            int a2 = r.nextInt(100);
            if (a1 > a2) {
                System.out.println(a1 + ">" + a2);
            } else if (a1 < a2) {
                System.out.println(a1 + "<" + a2);
            } else {
                System.out.println(a1 + "=" + a2);
            }
            a1 = r.nextInt(100);
        }
    }
}

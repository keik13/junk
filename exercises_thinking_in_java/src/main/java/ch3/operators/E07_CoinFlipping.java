package ch3.operators;

import java.util.Random;

/**
 * Write a program that simulates coin-flipping.
 */
public class E07_CoinFlipping {
    public static void main(String[] args) {
        Random r = new Random();
        int head = r.nextInt(100);
        int tail = r.nextInt(100);
        System.out.println("tail - " + tail + " head - " + head);
        System.out.println(tail > head ? "tail" : "head");
    }
}

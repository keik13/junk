package ch3.operators;

/**
 * Write a program that calculates velocity using a constant distance and a constant time.
 */
public class E04_CalcVelocity {
    static double calcVelocity(double distance, double time) {
        return distance / time;
    }

    public static void main(String[] args) {
        System.out.println("Velocity = " + calcVelocity(34, 20));
    }
}

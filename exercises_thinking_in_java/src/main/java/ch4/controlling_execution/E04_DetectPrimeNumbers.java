package ch4.controlling_execution;

/**
 * Write a program that uses two nested for loops and the modulus
 * operator (%) to detect and print prime numbers (integral numbers that are not evenly
 * divisible by any other numbers except for themselves and 1).
 */
public class E04_DetectPrimeNumbers {
    public static void main(String[] args) {
        detectPrimeNumbers(1);
    }

    static void detectPrimeNumbers(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return;
            }
        }
        System.out.println(number + " - prime number");
    }
}

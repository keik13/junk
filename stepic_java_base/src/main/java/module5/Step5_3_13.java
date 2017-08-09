package module5;


import java.util.Scanner;

/**
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел с точностью до шестого
 * знака после запятой. Числом считается последовательность символов, отделенная от окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 * <p>
 * На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы), метод main, прописать все import'ы.
 *
 * @author Andrey Koba)
 */

public class Step5_3_13 {
    public static void main(String[] args) {
        double result = 0;
        try (Scanner scanner = new Scanner("1 2 3")) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) result += scanner.nextDouble();
                else scanner.next();
            }
        }
        System.out.printf("%.6f", result);
    }
}

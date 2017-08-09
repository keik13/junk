package module4;

/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 * <p>
 * Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод.
 * Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.
 * <p>
 * Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод, откуда сообщение было залогировано.
 * <p>
 * Пример
 * <p>
 * package org.stepic.java.example;
 * <p>
 * public class Test {
 * public static void main(String[] args) {
 * System.out.println(getCallerClassAndMethodName());
 * anotherMethod();
 * }
 * <p>
 * private static void anotherMethod() {
 * System.out.println(getCallerClassAndMethodName());
 * }
 * <p>
 * public static String getCallerClassAndMethodName() {
 * // ...
 * }
 * }
 * При запуске эта программа должна вывести:
 * null
 * org.stepic.java.example.Test#main
 * P.S. При тестировании этой программы в среде разработки вы можете получить другой результат: вместо null в первой строчке
 * будет напечатан какой-то посторонний класс и метод. Это связано с тем, что среда разработки обычно запускает не ваш класс,
 * а свой собственный, который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой "java" в командной строке.
 * <p>
 * P.P.S. Эта задача в уроке про исключения не случайно :)
 * <p>
 * Created by Andrey on 30.09.2016.
 */
public class Step4_1_10 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        anotherMethod2();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod2() {
        anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace();
            if (elements.length >= 3) {
                return new StringBuilder()
                        .append(elements[2].getClassName())
                        .append("#")
                        .append(elements[2].getMethodName())
                        .toString();
            } else {
                return null;
            }
        }
    }
}

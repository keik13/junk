package module3;

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
 * По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
 * <p>
 * Класс AsciiCharSequence должен:
 * <p>
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определять методы length(), charAt(), subSequence() и toString()
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
 * <p>
 * В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и
 * обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.
 * <p>
 * P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254
 * <p>
 * Created by Andrey on 26.09.2016.
 */

/*public*/ class AsciiCharSequence implements CharSequence {
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public String toString() {
        return super.toString();
    }
}

/**
 * stub class
 */
public class Step3_5_8 {

}

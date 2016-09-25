package module2;

/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
 * <p>
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * <p>
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Sample Input:
 * 0 1
 * Sample Output:
 * 1
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_1_15 {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ 1 << bitIndex - 1;
    }
}

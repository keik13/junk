package module2;

/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * <p>
 * Решать можно разными способами:
 * <p>
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Sample Input 1:
 * 0
 * Sample Output 1:
 * false
 * <p>
 * Sample Input 2:
 * 1
 * Sample Output 2:
 * true
 * <p>
 * Sample Input 3:
 * -2
 * Sample Output 3:
 * true
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_2_9 {
    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}

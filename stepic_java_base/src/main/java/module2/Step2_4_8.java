package module2;

import java.math.BigInteger;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * <p>
 * Факториал NN вычисляется как 1⋅2⋅...⋅N1⋅2⋅...⋅N.
 * <p>
 * Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 * <p>
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Sample Input 1:
 * 1
 * Sample Output 1:
 * 1
 * <p>
 * Sample Input 2:
 * 3
 * Sample Output 2:
 * 6
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_4_8 {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}

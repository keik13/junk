package module6;


import java.util.stream.IntStream;

/**
 * Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:
 * <p>
 * Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
 * Первый элемент последовательности устанавливается равным этому числу.
 * Следующие элементы вычисляются по рекуррентной формуле Rn+1=mid(R2n)Rn+1=mid(Rn2), где mid — это функция,
 * выделяющая второй, третий и четвертый разряд переданного числа. Например, mid(123456)=345mid(123456)=345.
 * Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)
 * <p>
 * Пример
 * <p>
 * pseudoRandomStream(13) должен вернуть стрим, состоящий из следующих чисел:
 * <p>
 * 13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
 *
 * @author Andrey Koba)
 */

public class Step6_4_11 {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }
}

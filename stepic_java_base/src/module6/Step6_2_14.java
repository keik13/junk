package module6;

import java.util.HashSet;
import java.util.Set;

/**
 * Реализуйте метод, вычисляющий симметрическую разность двух множеств.
 * <p>
 * Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
 * <p>
 * Пример
 * <p>
 * Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 * <p>
 * Created by Andrey on 17.10.2016.
 */
public class Step6_2_14 {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> s1 = new HashSet<>(set1);
        Set<T> s2 = new HashSet<>(set2);
        s1.removeAll(set2);
        s2.removeAll(set1);
        s1.addAll(s2);
        return s1;
    }
}

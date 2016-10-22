package module6;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
 * <p>
 * Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
 * <p>
 * minMaxConsumer.accept(min, max);
 * Если стрим не содержит элементов, то вызовите
 * minMaxConsumer.accept(null, null);
 * <p>
 * Created by Andrey on 22.10.2016.
 */
public class Step6_4_12 {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> sortedList = stream.sorted(order).collect(Collectors.toList());
        if (!sortedList.isEmpty()) minMaxConsumer.accept(sortedList.get(0), sortedList.get(sortedList.size() - 1));
        else minMaxConsumer.accept(null, null);

    }
}

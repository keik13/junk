package module6;

/**
 * Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
 * <p>
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
 * <p>
 * С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:
 * <p>
 * Pair<Integer, String> pair = Pair.of(1, "hello");
 * Integer i = pair.getFirst(); // 1
 * String s = pair.getSecond(); // "hello"
 * <p>
 * Pair<Integer, String> pair2 = Pair.of(1, "hello");
 * boolean mustBeTrue = pair.equals(pair2); // true!
 * boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
 * <p>
 * <p>
 * Пожалуйста, не меняйте модификатор доступа класса Pair. Для корректной проверки класс должен иметь пакетную видимость.
 * <p>
 * Created by Andrey on 16.10.2016.
 */
public class Step6_1_12 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    }

}

class Pair<E, K> {
    private E firstElem;
    private K secondElem;

    public Pair(E firstElem, K secondElem) {
        this.firstElem = firstElem;
        this.secondElem = secondElem;
    }

    public static <E, K> Pair<E, K> of(E first, K second) {
        return new Pair<E, K>(first, second);
    }

    public E getFirst() {
        return firstElem;
    }

    public K getSecond() {
        return secondElem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (firstElem != null ? !firstElem.equals(pair.firstElem) : pair.firstElem != null) return false;
        return secondElem != null ? secondElem.equals(pair.secondElem) : pair.secondElem == null;

    }

    @Override
    public int hashCode() {
        int result = firstElem != null ? firstElem.hashCode() : 0;
        result = 31 * result + (secondElem != null ? secondElem.hashCode() : 0);
        return result;
    }
}
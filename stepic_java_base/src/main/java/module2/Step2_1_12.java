package module2;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * <p>
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * <p>
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 * Sample Input:
 * 0.1 0.2 0.3
 * Sample Output:
 * true
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_1_12 {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }
}

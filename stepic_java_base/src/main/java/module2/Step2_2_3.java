package module2;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * <p>
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 * <p>
 * Sample Input 1:
 * 32
 * Sample Output 1:
 * |
 * <p>
 * Sample Input 2:
 * 29
 * Sample Output 2:
 * y
 * <p>
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_2_3 {
    public static char charExpression(int a) {
        return (char)('\\' + a);
    }
}

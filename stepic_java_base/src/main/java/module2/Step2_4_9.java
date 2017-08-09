package module2;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 * <p>
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 * <p>
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Пример
 * <p>
 * Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_4_9 {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        int b = 0;
        int a = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (a1[a] < a2[b]) {
                arr[i] = a1[a];
                a++;
            } else {
                arr[i] = a2[b];
                b++;
            }
            if (b == a2.length) {
                System.arraycopy(a1, a, arr, ++i, a1.length - a);
                break;
            }
            if (a == a1.length) {
                System.arraycopy(a2, b, arr, ++i, a2.length - b);
                break;
            }
        }
        return arr;
    }
}

package module6;

import java.util.*;

/**
 * Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
 * затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.
 * <p>
 * Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 * <p>
 * В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
 * <p>
 * Sample Input:
 * 1 2 3 4 5 6 7
 * Sample Output:
 * 6 4 2
 * <p>
 * <p>
 * Created by Andrey on 18.10.2016.
 */
public class Step6_2_15 {
    public static void main(String[] args) {
        List<Integer> sequence = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                sequence.add(sc.nextInt());
            }
        }
        int i = 0;
        Iterator<Integer> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (i % 2 == 0) iterator.remove();
            i++;
        }
        Collections.reverse(sequence);
        for (Integer elem : sequence) System.out.printf("%d %s", elem, "");
    }
}

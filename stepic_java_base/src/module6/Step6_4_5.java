package module6;

import java.util.stream.IntStream;

/**
 * Created by Andrey on 21.10.2016.
 */
public class Step6_4_5 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(new int[]{200});
        stream.filter(n -> n > 100).mapToObj(Integer::toString).flatMapToInt(s -> s.chars()).peek(System.out::println).count();
    }
}

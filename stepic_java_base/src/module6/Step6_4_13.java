package module6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.
 * <p>
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке "Мама мыла раму 33 раза!"
 * ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
 * <p>
 * Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово. Выводите слова в нижнем регистре.
 * <p>
 * Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
 * <p>
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то дополнительно
 * упорядочите слова с одинаковой частотой в лексикографическом порядке.
 * <p>
 * Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.
 * <p>
 * Sample Input 1:
 * Мама мыла-мыла-мыла раму!
 * Sample Output 1:
 * мыла
 * мама
 * раму
 * <p>
 * Sample Input 2:
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa.
 * Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget
 * metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Integer vel odio nec mi tempor dignissim.
 * <p>
 * Created by Andrey on 23.10.2016.
 */
public class Step6_4_13 {
    public static void main(String[] args) {
        try (Stream<String> stream = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)).lines()) {
            stream.flatMap(s -> Stream.of(s.split("[^\\wа-яА-Я]+")))
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                    .entrySet()
                    .stream().sorted((e1, e2) -> {
                if (e2.getValue().compareTo(e1.getValue()) != 0) {
                    return e2.getValue().compareTo(e1.getValue());
                } else {
                    return e1.getKey().compareTo(e2.getKey());
                }
            })
                    .map(e -> e.getKey())
                    .limit(10)
                    .forEach(System.out::println);
        }
    }
}

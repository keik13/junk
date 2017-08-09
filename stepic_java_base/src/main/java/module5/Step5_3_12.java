package module5;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 * <p>
 * Пример
 * <p>
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 * <p>
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 *
 * @author Andrey Koba)
 */

public class Step5_3_12 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder result = new StringBuilder();
        try (Reader reader = new InputStreamReader(inputStream, charset)) {
            char[] buf = new char[1024];
            int count;
            while ((count = reader.read(buf)) > 0) {
                result.append(buf, 0, count);
            }
        }
        return result.toString();
    }
}

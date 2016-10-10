package module5;

import java.io.UnsupportedEncodingException;

/**
 * Какими байтами представляется символ 'Ы' в кодировке UTF-8? Введите десятичные беззнаковые значения байт через пробел, например, 10 34 254.
 * <p>
 * Created by Andrey on 11.10.2016.
 */
public class Step5_3_10 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printStringToUnsignedDecimalByte("Ы");
    }

    public static void printStringToUnsignedDecimalByte(String input) throws UnsupportedEncodingException {
        for (byte b : input.getBytes("UTF-8")) {
            System.out.println(Byte.toUnsignedInt(b));
        }
    }
}

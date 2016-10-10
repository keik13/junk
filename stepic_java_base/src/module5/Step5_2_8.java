package module5;

import java.io.IOException;
import java.io.InputStream;

/**
 * Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.
 * <p>
 * Контрольная сумма данных вычисляется по следующему алгоритму:
 * <p>
 * Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
 * Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: Cn+1=rotateLeft(Cn) xor bn+1Cn+1=rotateLeft(Cn) xor bn+1 ,
 * где CnCn — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft),
 * bnbn — n-ный байт данных.
 * Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream исключение должно выбрасываться из метода.
 * <p>
 * Пример
 * На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы должно быть возвращено число 71.
 * <p>
 * Created by Andrey on 10.10.2016.
 */
public class Step5_2_8 {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int controlSum = 0;
        int read;
        while ((read = inputStream.read()) > 0) {
            controlSum = Integer.rotateLeft(controlSum, 1) ^ read;
        }

        return controlSum;
    }
}

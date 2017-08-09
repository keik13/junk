package module4;

import java.util.logging.*;

/**
 * В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет выполнить
 * более тонкую и хитрую настройку, чем при помощи properties-файла.
 * <p>
 * Требуется выставить такие настройки, чтобы:
 * <p>
 * Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
 * Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
 * Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения печатались
 * в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
 * Не упомянутые здесь настройки изменяться не должны.
 * <p>
 * (*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать файлы на диске, поэтому придется так.
 * <p>
 * Подсказки:
 * <p>
 * Level есть не только у Logger, но и у Handler.
 * Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.
 * <p>
 * Created by Andrey on 03.10.2016.
 */
public class Step4_3_8 {
    private static void configureLogging() {
        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerA.setLevel(Level.ALL);
        loggerB.setLevel(Level.WARNING);

        Logger loggerOSJ = Logger.getLogger("org.stepic.java");
        loggerOSJ.setUseParentHandlers(false);
        Handler conHandler = new ConsoleHandler();
        conHandler.setLevel(Level.ALL);
        conHandler.setFormatter(new XMLFormatter());
        loggerOSJ.addHandler(conHandler);
    }
}

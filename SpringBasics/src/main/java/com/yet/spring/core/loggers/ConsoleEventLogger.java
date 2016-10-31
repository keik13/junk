package com.yet.spring.core.loggers;

/**
 * Created by Andrey on 31.10.2016.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(String msg) {
        System.out.println(msg);
    }
}

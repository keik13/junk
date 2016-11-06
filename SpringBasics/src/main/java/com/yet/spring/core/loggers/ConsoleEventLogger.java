package com.yet.spring.core.loggers;

import com.yet.spring.core.events.Event;

/**
 * Created by Andrey on 31.10.2016.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}

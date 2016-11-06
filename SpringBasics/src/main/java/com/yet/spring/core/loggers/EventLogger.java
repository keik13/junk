package com.yet.spring.core.loggers;

import com.yet.spring.core.events.Event;

/**
 * Created by Andrey on 01.11.2016.
 */
public interface EventLogger {
    void logEvent(Event event);
}

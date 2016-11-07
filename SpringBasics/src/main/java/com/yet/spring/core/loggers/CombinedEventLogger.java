package com.yet.spring.core.loggers;

import com.yet.spring.core.events.Event;

import java.util.List;

/**
 * Created by Andrey on 08.11.2016.
 */
public class CombinedEventLogger implements EventLogger {
    List<EventLogger> eventLoggers;

    public CombinedEventLogger(List<EventLogger> eventLoggers) {
        this.eventLoggers = eventLoggers;
    }

    @Override
    public void logEvent(Event event) {
        eventLoggers.forEach(eventLogger -> eventLogger.logEvent(event));
    }
}

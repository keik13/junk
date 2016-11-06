package com.yet.spring.core.loggers;

import com.yet.spring.core.events.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 07.11.2016.
 */
public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName, int cacheSize) {
        super(fileName);
        this.cacheSize = cacheSize;
        this.cache = new ArrayList<Event>(cacheSize);
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() > cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy() {
        if (!cache.isEmpty()) writeEventsFromCache();
    }

    private void writeEventsFromCache() {
        cache.stream().forEach((event) -> super.logEvent(event));
    }
}

package com.yet.spring.core;

import com.yet.spring.core.beans.Client;
import com.yet.spring.core.events.Event;
import com.yet.spring.core.events.EventType;
import com.yet.spring.core.loggers.EventLogger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

/**
 * онлайн курс по спрингу - https://www.youtube.com/playlist?list=PL6jg6AGdCNaWF-sUH2QDudBRXo54zuN1t
 * <p>
 * Created by Andrey on 31.10.2016.
 */
public class App {
    private Client client;
    private EventLogger defaultEventLogger;
    private Map<EventType, EventLogger> loggers;

    public App(Client client, EventLogger defaultEventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.defaultEventLogger = defaultEventLogger;
        this.loggers = loggers;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        DateFormat df = new SimpleDateFormat();
        app.logEvent(EventType.ERROR, new Event(Calendar.getInstance().getTime(), df), "Some event for user 1");
        app.logEvent(EventType.INFO, new Event(Calendar.getInstance().getTime(), df), "Some event for user 2");

        ctx.close();
    }

    private void logEvent(EventType eventType, Event event, String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(message);
        EventLogger logger = loggers.get(eventType);
        if (logger == null) logger = defaultEventLogger;
        logger.logEvent(event);
    }
}

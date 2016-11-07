package com.yet.spring.core;

import com.yet.spring.core.beans.Client;
import com.yet.spring.core.events.Event;
import com.yet.spring.core.loggers.EventLogger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * онлайн курс по спрингу - https://www.youtube.com/playlist?list=PL6jg6AGdCNaWF-sUH2QDudBRXo54zuN1t
 * <p>
 * Created by Andrey on 31.10.2016.
 */
public class App {
    private Client client;
    private EventLogger consoleEventLogger;

    public App(Client client, EventLogger consoleEventLogger) {
        this.client = client;
        this.consoleEventLogger = consoleEventLogger;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

//        app.logEvent("Some event for user 1");
//        app.logEvent("Some event for user 2");
        ctx.close();
    }

    private void logEvent(Event event) {
//        String message = msg.replaceAll(client.getId(), client.getFullName());
        consoleEventLogger.logEvent(event);
    }
}
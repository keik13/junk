package com.yet.spring.core;

import com.yet.spring.core.beans.Client;
import com.yet.spring.core.loggers.EventLogger;

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

    public App() {
    }

    public static void main(String[] args) {
        App app = new App();

//        app.client = new Client("1", "John Smith");
//        app.consoleEventLogger = new ConsoleEventLogger();

        app.logEvent("Some event for user 1");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        consoleEventLogger.logEvent(message);
    }
}

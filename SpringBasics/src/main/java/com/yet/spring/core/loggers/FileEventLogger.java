package com.yet.spring.core.loggers;

import com.yet.spring.core.events.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by Andrey on 06.11.2016.
 */
public class FileEventLogger implements EventLogger {
    private String fileName;
    private File file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() throws IOException {
        this.file = new File(fileName);
        if (file.exists() && !file.canWrite()) throw new IOException();
        else if (!file.exists()) file.createNewFile();
    }
}

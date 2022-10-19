package loggerExample.logSystem;

import loggerExample.logSystem.BaseLogger;

public class FileLogger implements BaseLogger {
    @Override
    public void log() {
        System.out.println("Logged to File");
    }
}

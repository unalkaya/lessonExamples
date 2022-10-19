package loggerExample.logSystem;

import loggerExample.logSystem.BaseLogger;

public class DatabaseLogger implements BaseLogger {
    @Override
    public void log() {
        System.out.println("Logged to DataBase");
    }
}

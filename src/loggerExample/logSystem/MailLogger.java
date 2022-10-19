package loggerExample.logSystem;

import loggerExample.logSystem.BaseLogger;

public class MailLogger implements BaseLogger {
    @Override
    public void log() {
        System.out.println("Logged to Mail");
    }
}

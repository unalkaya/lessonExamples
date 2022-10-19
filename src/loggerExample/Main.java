package loggerExample;

import loggerExample.logSystem.BaseLogger;
import loggerExample.logSystem.DatabaseLogger;
import loggerExample.logSystem.FileLogger;
import loggerExample.logSystem.MailLogger;

public class Main {
    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new MailLogger(), new FileLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        customerManager.add();

    }
}

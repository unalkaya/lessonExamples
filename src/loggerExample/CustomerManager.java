package loggerExample;

import loggerExample.logSystem.BaseLogger;

public class CustomerManager {
    private BaseLogger[] loggers;

    public CustomerManager(BaseLogger[] loggers) {
        this.loggers = loggers;
    }

    public void add(){
        System.out.println("Customer Added");
        for (BaseLogger logger:loggers) {
            logger.log();
        }

    }
}

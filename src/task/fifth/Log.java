package task.fifth;

import java.util.logging.*;

public class Log {
    private static final Logger LOG_CLASS_A = Logger.getLogger("org.stepic.java.logging.ClassA");
    private static final Logger LOG_CLASS_B = Logger.getLogger("org.stepic.java.logging.ClassB");
    private static final Logger LOG = Logger.getLogger("org.stepic.java");

    private static void configureLogging() {
        LOG_CLASS_A.setLevel(Level.ALL);
        LOG_CLASS_B.setLevel(Level.WARNING);
        LOG.setLevel(Level.ALL);
        ConsoleHandler Handler = new ConsoleHandler();
        Handler.setLevel(Level.ALL);
        Handler.setFormatter(new XMLFormatter());
        LOG.setUseParentHandlers(false);
        LOG.addHandler(Handler);
    }
}

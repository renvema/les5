package task.fifth;

import java.util.logging.*;

public class Log {
    private static final Logger LOGCLASSA = Logger.getLogger("org.stepic.java.logging.ClassA");
    private static final Logger LOGCLASSB = Logger.getLogger("org.stepic.java.logging.ClassB");
    private static final Logger LOG = Logger.getLogger("org.stepic.java");

    private static void configureLogging() {
        LOGCLASSA.setLevel(Level.ALL);
        LOGCLASSB.setLevel(Level.WARNING);
        LOG.setLevel(Level.ALL);
        ConsoleHandler Handler = new ConsoleHandler();
        Handler.setLevel(Level.ALL);
        Handler.setFormatter(new XMLFormatter());
        LOG.setUseParentHandlers(false);
        LOG.addHandler(Handler);
    }
}

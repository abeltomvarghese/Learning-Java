package Logging;

import java.util.Formatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    static Logger logger2 = Logger.getLogger("com.company.finBot");
    static Logger logger3 = Logger.getLogger("Logging");
    public static void main (String[] args) {

        logger.log(Level.INFO, "My First Log message");
        logger.log(Level.SEVERE, "total failure - all sorts of mess");

        logger.log(Level.INFO, "{0} is my favorite", "Java");
        logger.log(Level.INFO, "{0} is {1} days from {2}",new Object[]{"Wed",2,"Fri"});

        Handler h = new ConsoleHandler();
        SimpleFormatter f = new SimpleFormatter();
        h.setFormatter(f);
        logger2.addHandler(h);
        logger2.log(Level.SEVERE, "nothing works");

        try {
            FileHandler fh = new FileHandler("G:\\My Drive\\Github Repos\\Learning-Java\\ControllingAppExecAndEnv\\logs\\myLog_%g.log",1000,4);
            fh.setFormatter(new SimpleFormatter());
            logger3.addHandler(fh);
            logger3.log(Level.INFO, "testing file handler");
        } catch (Exception e) {e.printStackTrace();}

    }
}

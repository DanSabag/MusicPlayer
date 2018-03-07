package com.dan.utils.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class MusicPlayerLogger {
    private static MusicPlayerLogger instance = new MusicPlayerLogger();
    private static Logger logger;

    public static Logger getInstance() {
        return logger;
    }

    private MusicPlayerLogger() {
        logger = (Logger) LogManager.getLogger();
    }
}

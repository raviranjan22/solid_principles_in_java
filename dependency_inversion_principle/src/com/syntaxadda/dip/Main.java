package com.syntaxadda.dip;

public class Main {
    public static void main(String[] args) {
        // Creating instances of different logger services
        LoggerService fileLoggerService = new FileLoggerService();
        LoggerService consoleLoggerService = new ConsoleLoggerService();
        LoggerService databaseLoggerService = new DatabaseLoggerService();

        // Using the Logger with different logger services
        Logger fileLogger = new Logger(fileLoggerService);
        Logger consoleLogger = new Logger(consoleLoggerService);
        Logger databaseLogger = new Logger(databaseLoggerService);

        // Logging messages using different logger services
        fileLogger.logMessage("This is a log message to a file.");
        consoleLogger.logMessage("This is a log message to console.");
        databaseLogger.logMessage("This is a log message to a database.");
    }
}


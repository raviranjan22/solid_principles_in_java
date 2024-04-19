package com.syntaxadda.dip;

// Database logger service
class DatabaseLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        // Implementation to log message to a database
        System.out.println("Logging to database: " + message);
    }
}
package com.syntaxadda.dip;

// Console logger service
class ConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        // Implementation to log message to console
        System.out.println("Logging to console: " + message);
    }
}

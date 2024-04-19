package com.syntaxadda.dip;

// File logger service
class FileLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        // Implementation to log message to a file
        System.out.println("Logging to file: " + message);
    }
}

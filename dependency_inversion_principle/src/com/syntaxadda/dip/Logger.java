package com.syntaxadda.dip;

// High-level module that depends on abstraction (LoggerService)
class Logger {
    private final LoggerService loggerService;

    public Logger(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void logMessage(String message) {
        loggerService.log(message);
    }
}

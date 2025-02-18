package com.ndbs.util;

public class SagaConfig {

    private static volatile SagaConfig instance;

    // Example config fields — could be anything you need globally
    private String logLevel;
    private int sagaTimeoutInSeconds;

    // Private constructor to prevent direct instantiation
    private SagaConfig() {
        // Default or loaded from external config
        this.logLevel = "INFO";
        this.sagaTimeoutInSeconds = 30;
    }

    // Public static method for obtaining the single instance
    public static SagaConfig getInstance() {
        if (instance == null) {
            synchronized (SagaConfig.class) {
                if (instance == null) {
                    instance = new SagaConfig();
                }
            }
        }
        return instance;
    }

    // Example method: In real usage, this could be more sophisticated
    public void log(String message) {
        if ("INFO".equalsIgnoreCase(logLevel)) {
            System.out.println("[SAGA-LOG] " + message);
        }
        // else if DEBUG, etc...
    }

    // Getters / Setters
    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public int getSagaTimeoutInSeconds() {
        return sagaTimeoutInSeconds;
    }

    public void setSagaTimeoutInSeconds(int sagaTimeoutInSeconds) {
        this.sagaTimeoutInSeconds = sagaTimeoutInSeconds;
    }
}

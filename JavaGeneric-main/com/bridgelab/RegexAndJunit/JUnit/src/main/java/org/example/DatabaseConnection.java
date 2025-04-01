package org.example;

public class DatabaseConnection {
    private boolean isConnected;

    // Simulate connecting to a database
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // Simulate disconnecting from a database
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check if connection is active
    public boolean isConnected() {
        return isConnected;
    }
}


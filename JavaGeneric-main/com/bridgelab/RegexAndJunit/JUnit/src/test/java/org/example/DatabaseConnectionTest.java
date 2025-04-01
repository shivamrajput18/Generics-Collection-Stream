package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DatabaseConnectionTest {

    DatabaseConnection db = new DatabaseConnection();

    @BeforeEach
    void setup(){
        db.connect();
    }

    @Test
    void connect() {
        assertEquals(true, db.isConnected());
    }

    @Test
    void disconnect() {
        assertEquals(true,db.isConnected());
    }

    @Test
    void isConnected() {
        assertTrue(db.isConnected());
    }
}
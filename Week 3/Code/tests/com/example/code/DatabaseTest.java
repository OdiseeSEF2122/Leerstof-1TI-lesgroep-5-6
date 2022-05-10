package com.example.code;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void addUser_WithUserNotPresent_ReturnsTrue() {
        // Arrange
        Database database = new Database();
        User user = new User("", "");

        // Act
        boolean result = database.addUser(user);

        // Assert
        assertTrue(result);
    }

    @Test
    void addUser_WithUserPresent_ReturnsFalse(){
        // Arrange
        Database database = new Database();
        User user = new User("", "");
        database.addUser(user);

        // Act
        boolean result = database.addUser(user);

        // Assert
        assertFalse(result);
    }
}
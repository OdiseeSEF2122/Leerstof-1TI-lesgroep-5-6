package com.example.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void onRegistreerBtnClicked() {
        // Arrange
        HelloController controller = new HelloController();

        // Act
        controller.onRegistreerBtnClicked();

        // Assert
    }
}
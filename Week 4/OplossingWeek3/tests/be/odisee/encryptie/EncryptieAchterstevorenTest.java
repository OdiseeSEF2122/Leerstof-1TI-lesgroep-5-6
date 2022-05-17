package be.odisee.encryptie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptieAchterstevorenTest {

    @Test
    public void encrypt_GivenHello_ReturnsolleH(){
        // Arrange
        EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();

        // Act
        String output = encryptor.encrypt("Hello");

        // Assert
        assertEquals("olleH", output);
    }

    @Test
    public void decrypt_GivenolleH_ReturnsHello(){
        // Arrange
        EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();

        // Act
        String output = encryptor.decrypt("olleH");

        // Assert
        assertEquals("Hello", output);
    }

}
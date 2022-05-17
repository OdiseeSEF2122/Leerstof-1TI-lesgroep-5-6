package be.odisee.encryptie;

public abstract class EncryptionAlgorithm {

    public abstract String encrypt(String input);

    public abstract String decrypt(String input);
}

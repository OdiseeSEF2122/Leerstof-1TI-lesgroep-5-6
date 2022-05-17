package be.odisee.encryptie;

public class EncryptieAchterstevoren extends EncryptionAlgorithm{

    @Override
    public String encrypt(String input){
        String output = "";

        for(int i = 0; i<input.length(); i++){
            output = input.charAt(i) + output;
        }

        return output;
    }

    @Override
    public String decrypt(String input){
        return encrypt(input);
    }
}

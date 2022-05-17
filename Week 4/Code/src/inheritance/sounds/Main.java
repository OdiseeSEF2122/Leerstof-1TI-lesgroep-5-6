package inheritance.sounds;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SoundProducer[] irritanteDingen = new SoundProducer[]{
                new Kat("Jerry"),
                new BernerSennen("Grote hond"),
                new Chiuahua("Enkelbijter"),
                new Mens("Jens"),
                new SoundProducer("Verteller")
        };

        // for each
        for(SoundProducer ding: irritanteDingen){
            ding.makeSound();
        }
    }
}

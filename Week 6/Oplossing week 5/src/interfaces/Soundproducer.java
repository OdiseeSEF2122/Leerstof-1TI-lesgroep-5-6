package interfaces;

abstract class Eater{
    abstract void eat();
}

public interface Soundproducer {

    void makeSound();
}

class Human extends Eater implements Soundproducer {

    @Override
    public void makeSound() {

    }

    @Override
    void eat() {

    }
}

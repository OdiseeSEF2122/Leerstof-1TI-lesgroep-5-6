package be.odisee;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Geef een getal in");



        Square square = new Square();
        double kwadraat = square.square(25);
        double vierkantswortel = square.squareRoot(25);

        System.out.println("Origineel getal " + 25);
        System.out.println("Kwadraat " + kwadraat);
        System.out.println("Vierkantswortel " + vierkantswortel);


    }
}

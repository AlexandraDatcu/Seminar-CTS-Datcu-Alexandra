package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.Decorator;
import decorator.clase.DecoratorBilet;
import decorator.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new Bilet("Gigel", "Petrolul","Botosani");
        IBilet bilet2 = new Bilet("Gigel", "Romania","Spania");
        IBilet bilet3 = new Bilet("Gigel", "Germania","Spania");

        bilet1.printareBilet();
        bilet2.printareBilet();
        bilet3.printareBilet();

        Decorator decoratorBilet = new DecoratorBilet(bilet3);
        Decorator decoratorBilet1 = new DecoratorBilet(bilet2);
        decoratorBilet1.printareBilet();
        decoratorBilet.printareBilet();





    }
}
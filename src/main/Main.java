package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Gigel");
        var zoo = new Zoo("Zoo",zooKeeper);
        var lion = new Lion(12,"Simba");
        zoo.addAnimal(lion);
        zoo.addAnimal(new Zebra(10,"Marty"));
        zoo.feedAnimals();
        zoo.addAnimal(new Pisica(5,"Tom"));
        zoo.feedAnimals();
    }
}
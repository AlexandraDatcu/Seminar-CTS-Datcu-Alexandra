package model;

public class Zebra extends Animal{
    public Zebra(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat(String numeIngrijitor) {
        System.out.println("Zebra cu numele " + super.getName() + " in varsta de "+ super.getAge() + "a fost hranit de " + numeIngrijitor);
    }

}

package model;

public class Lion extends Animal{
    public Lion(int age, String name) {
        super(age, name);
    }
    @Override
    public void eat(String numeIngrijitor) {
        System.out.println("Leul cu numele " + getName() + " in varsta de "+ getAge() + "a fost hranit de " + numeIngrijitor);
    }
}

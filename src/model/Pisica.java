package model;

public class Pisica extends Animal  {
    public Pisica(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat(String numeIngrijitor) {
        System.out.println("Pisica "+ super.getName() + " a fost ingrijita de "+ numeIngrijitor);
    }
}

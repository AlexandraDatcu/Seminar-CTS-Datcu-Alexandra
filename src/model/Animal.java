package model;

public abstract class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public abstract void eat(String numeIngrijitor);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

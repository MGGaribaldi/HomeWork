/**
 *
 * Java 1.HomeWork6
 * @author Roman
 * @version 24.11.2021
 */

class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 200, 0);
        Dog dog = new Dog("Sharik", 500, 10);

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;

    Animal(String name,int run,int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    @Override
    public String toString() {
        return name + ", " + run + ", " + swim;
    }
}

class Cat extends Animal {
    Cat(String name, int run, int swim) {
        super(name,run,swim);
    }
}

class Dog extends Animal {
    Dog(String name, int run, int swim) {
        super(name,run,swim);
    }
}
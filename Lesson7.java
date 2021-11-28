/**
 *
 * Java 1.HomeWork7
 * @author Roman
 * @version 27.11.2021
 */

class Lesson7 {
    public static void main(String[] args) {
        Cat[] cat = {
            new Cat("Murzik", 10), new Cat("Barsik", 15), new Cat("Murka", 25)
        };
        Plate plate = new Plate(40);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(30);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setHungry(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    void setHungry(boolean status) {
        hungry = status;
    }

    void eat(Plate plate) {
        if (!hungry) {
            hungry = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "(name=" + name + ", appetite=" + appetite + ", hungry=" + hungry + ")";
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate : " + food;
    }
}
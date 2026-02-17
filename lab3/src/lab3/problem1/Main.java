package lab3.problem1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Monkey", 2, 2);

        Cat cat = new Cat("barsik", 3, 4);

        cat.move();
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}

package lab3.problem1;

public class Cat extends Animal{
    public Cat () {
        super();
    }

    public Cat(String type) {
        super(type, 0, 4);
    }

    public Cat(String type, int age) {
        super(type, age, 4);
    }

    public Cat(String type, int age, int numberOfLegs) {
        super(type, age, numberOfLegs);
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void meow() {
        System.out.println("Meow");
    }
}

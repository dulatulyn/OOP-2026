package lab4.entities;

import lab4.core.Attackable;
import lab4.core.Pushable;

public class WoodenBox extends GameObject implements Attackable, Pushable {
    private boolean destroyed;

    public WoodenBox(String name, int x, int y) {
        super(name, x, y);
        this.destroyed = false;
    }

    @Override
    public void push(int dx, int dy) {
        if (destroyed) {
            System.out.println(getName() + " is destroyed, cant push it");
            return;
        }
        setX(getX() + dx);
        setY(getY() + dy);
        System.out.println(getName() + " pushed to " + getX() + " " + getY());
    }

    @Override
    public void takeDamage(int damage) {
        if (destroyed) {
            System.out.println(getName() + " is already destroyed");
            return;
        }
        destroyed = true;
        System.out.println(getName() + " got destroyed");
    }

    @Override
    public boolean isAlive() {
        return !destroyed;
    }
}

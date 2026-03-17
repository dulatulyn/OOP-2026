package lab4.entities;

import lab4.core.Pushable;

public class Rock extends GameObject implements Pushable {
    public Rock(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void push(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
        System.out.println(getName() + " pushed to " + getX() + " " + getY());
    }
}

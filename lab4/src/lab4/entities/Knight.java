package lab4.entities;

import lab4.core.Attackable;
import lab4.core.Interactable;
import lab4.core.Pushable;

public class Knight extends GameObject {
    private int attackPower;

    public Knight(String name, int x, int y, int attackPower) {
        super(name, x, y);
        this.attackPower = attackPower;
    }

    public void attack(Attackable target) {
        System.out.println(getName() + " attacks");
        target.takeDamage(attackPower);
    }

    public void push(Pushable target) {
        System.out.println(getName() + " is pushing");
        target.push(1, 0);
    }

    public void interact(Interactable target) {
        target.interact();
    }

    public void move(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
        System.out.println(getName() + " moved to " + getX() + " " + getY());
    }
}

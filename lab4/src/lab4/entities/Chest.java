package lab4.entities;

import lab4.core.Interactable;
import lab4.core.Pushable;

public class Chest extends GameObject implements Interactable, Pushable {
    private boolean opened;
    private int gold;

    public Chest(String name, int x, int y, int gold) {
        super(name, x, y);
        this.gold = gold;
        this.opened = false;
    }

    @Override
    public void interact() {
        if (opened) {
            System.out.println(getName() + " is already opened");
            return;
        }
        opened = true;
        System.out.println(getName() + " opened, found " + gold + " gold");
    }

    @Override
    public void push(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
        System.out.println(getName() + " pushed to " + getX() + " " + getY());
    }

    public boolean isOpened() {
        return opened;
    }

    public int getGold() {
        return gold;
    }
}

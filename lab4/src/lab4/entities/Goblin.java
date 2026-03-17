package lab4.entities;

import lab4.core.Attackable;

public class Goblin extends GameObject implements Attackable {
    private int hp;

    public Goblin(String name, int x, int y, int hp) {
        super(name, x, y);
        this.hp = hp;
    }

    @Override
    public void takeDamage(int damage) {
        if (!isAlive()) {
            System.out.println(getName() + " is already dead");
            return;
        }
        hp -= damage;
        System.out.println(getName() + " took " + damage + " damage, hp is now " + hp);
        if (!isAlive()) {
            System.out.println(getName() + " died");
        }
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }
}

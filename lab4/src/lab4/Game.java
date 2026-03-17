package lab4;

import lab4.entities.*;

public class Game {
    public static void main(String[] args) {
        Knight knight = new Knight("Knight", 0, 0, 30);
        Goblin goblin = new Goblin("Goblin", 3, 3, 50);
        WoodenBox box = new WoodenBox("WoodenBox", 1, 2);
        Rock rock = new Rock("Rock", 4, 4);
        Chest chest = new Chest("Chest", 5, 5, 100);

        System.out.println("testing move");
        knight.move(1, 0);
        knight.move(0, 1);

        System.out.println("testing attack");
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(box);
        knight.attack(box);

        System.out.println("testing push");
        knight.push(rock);
        knight.push(box);
        knight.push(chest);

        System.out.println("testing interact");
        knight.interact(chest);
        knight.interact(chest);
    }
}

package lab4.entities;

public abstract class GameObject {
    private String name;
    private int x;
    private int y;

    public GameObject(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return name + " at (" + x + ", " + y + ")";
    }
}

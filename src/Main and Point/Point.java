package Main;

public class Point {
    public int x = 0;
    public int y = 0;

    public Point() {
        this(0);
    }

    public Point(int size) {
        this.x = size;
        this.y = size;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void printState() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

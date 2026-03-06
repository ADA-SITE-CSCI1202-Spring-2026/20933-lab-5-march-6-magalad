public class Circle implements Movable {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Circle center=" + center + ", radius=" + radius;
    }

    public static void main(String[] args) {

        Point p = new Point(2, 3);
        System.out.println(p);

        p.moveUp();
        p.moveRight();

        System.out.println(p);

        Circle c = new Circle(new Point(5, 5), 10);
        System.out.println(c);

        c.moveLeft();
        c.moveDown();

        System.out.println(c);
    }
}
class Point {

    public double x = 2;
    public double y = 3;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(double x) {
        this(x, x);
    }

    Point() {
        this(0);
    }

}

public class ZadO07 {

    public static void main(String[] args) {

        Point p1 = new Point(), p2 = new Point();

        System.out.format("p1: %f, %f\n", p1.x, p1.y);
        System.out.format("p2: %f, %f\n", p2.x, p2.y);

        p2.x = 10;
        p2.y = 15;

        System.out.format("p1: %f, %f\n", p1.x, p1.y);
        System.out.format("p2: %f, %f\n", p2.x, p2.y);

    }

}

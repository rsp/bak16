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

    void print() {
        System.out.format("(%f, %f)\n", x, y);
    }

    double getDistance() {
        return Math.sqrt(x*x + y*y);
    }

    double getDistance(Point p) {
        return Math.sqrt( Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2) );
    }

    static double getDistance(Point p1, Point p2) {
        return Math.sqrt( Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2) );
    }

    void printDistance() {
        System.out.format("(%f, %f) distance: %f\n", x, y, getDistance());
    }

    void printDistance(Point p) {
        System.out.format("(%f, %f)-(%f, %f) distance: %f\n", x, y, p.x, p.y, getDistance(p));
    }

    static void printDistance(Point p1, Point p2) {
        System.out.format("(%f, %f)-(%f, %f) distance: %f\n", p1.x, p1.y, p2.x, p2.y, getDistance(p1, p2));
    }

}

class Rectangle {
    public Point p0;
    public Point p1;
}

public class ZadO18 {

    public static void main(String[] args) {

        Point[] t = new Point[10];

        for (int i = 0; i < t.length; i++)
            t[i] = new Point(Math.random(), Math.random());

        for (Point p: t)
            p.print();

    }

}

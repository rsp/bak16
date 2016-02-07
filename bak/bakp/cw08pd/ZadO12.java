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

    void printDistance() {
        System.out.format("(%f, %f) distance: %f\n", x, y, getDistance());
    }

    void printDistance(Point p) {
        System.out.format("(%f, %f)-(%f, %f) distance: %f\n", x, y, p.x, p.y, getDistance(p));
    }

}

public class ZadO12 {

    public static void main(String[] args) {

        Point p1 = new Point(),
              p2 = new Point(1),
              p3 = new Point(4, 5);

        p1.printDistance(p2);
        p2.printDistance(p3);
        p3.printDistance(p2);

    }

}

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

    void printDistance() {
        System.out.format("(%f, %f) distance: %f\n", x, y, getDistance());
    }

}

public class ZadO11 {

    public static void main(String[] args) {

        Point p1 = new Point(),
              p2 = new Point(1),
              p3 = new Point(3, 4);

        p1.printDistance();
        p2.printDistance();
        p3.printDistance();

    }

}

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

public class ZadO08 {

    public static void main(String[] args) {

        Point p1 = new Point(),
              p2 = new Point(1),
              p3 = new Point(2, 3);

        System.out.format("p1: %f, %f\n", p1.x, p1.y);
        System.out.format("p2: %f, %f\n", p2.x, p2.y);
        System.out.format("p2: %f, %f\n", p3.x, p3.y);

    }

}

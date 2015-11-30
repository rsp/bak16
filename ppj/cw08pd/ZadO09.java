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
        System.out.format("(%f, %f)\n", this.x, this.y);
    }

}

public class ZadO09 {

    public static void main(String[] args) {

        Point p1 = new Point(),
              p2 = new Point(1),
              p3 = new Point(2, 3);

        System.out.print("p1: ");
        p1.print();
        System.out.print("p2: ");
        p2.print();
        System.out.print("p3: ");
        p3.print();


    }

}

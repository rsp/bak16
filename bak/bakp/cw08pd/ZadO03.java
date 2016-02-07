class Point {

    public double x = 2;
    public double y = 3;

}

public class ZadO03 {

    public static void main(String[] args) {

        Point p1 = new Point(), p2 = new Point();

        System.out.format("p1: %f, %f\n", p1.x, p1.y);
        System.out.format("p2: %f, %f\n", p2.x, p2.y);

        p1.x = 7;
        p1.y = 9;
        p2.x = 12;
        p2.y = 23;

        System.out.format("p1: %f, %f\n", p1.x, p1.y);
        System.out.format("p2: %f, %f\n", p2.x, p2.y);

    }

}

class Point {

    static public double x = 2;
    static public double y = 3;

}

public class ZadO04 {

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

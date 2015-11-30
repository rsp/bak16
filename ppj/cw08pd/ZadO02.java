class Point {

    public double x = 2;
    public double y = 3;

}

public class ZadO02 {

    public static void main(String[] args) {

        Point p = new Point();

        System.out.format("%f, %f\n", p.x, p.y);

        p.x += 2;
        p.y += 2;

        System.out.format("%f, %f\n", p.x, p.y);

    }

}

public class ZadM02 {

    static double pole(double r) {
        int x=0;
        for (int i = 0; i < 4e6; i++)
            x += Math.pow(Math.random(),2) + Math.pow(Math.random(),2) <= 1 ? 1 : 0;
        return r*r*x/1e6;
    }

    public static void main(String[] args) {

        for (double r = 0; r < 3; r++) {
            System.out.format("r = %.2f, P = %.2f\n", r, pole(r));
        }

    }

}

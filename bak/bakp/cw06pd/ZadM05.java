public class ZadM05 {

    static int suma(int[] t) {
        return suma(t, 0, 0);
    }

    static int suma(int[] t, int i, int s) {
        return i < t.length ? suma(t, i+1, s+t[i]) : s;
    }

    static void printInts(int[] t) {
        for (int i:t)
            System.out.format("%4d", i);
    }

    public static void main(String[] args) {

        System.out.println();

        int[][] tt = {{1,1,1,1,1,1,1,1},
                      {100,0,0,0,50,0,0,0},
                      {100,100,100,100,100,500,500}};

        for (int[] t:tt) {
            printInts(t);
            System.out.println("   suma = " + suma(t));
        }

    }

}

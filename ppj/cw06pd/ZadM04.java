public class ZadM04 {

    static void printInts2D(int[][] t) {
        for (int[] j:t) {
            for (int i:j)
                System.out.format("%4d", i);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] t1 = {1,2,3,4,5,6,7,8},
              t2 = {10,20,30,40,50,60,70,80},
              t3 = {100,200,300,400,500,600,700};

        int[][][] tt = {{t1, t2, t3}, {t3, t2}, {t2, t1}};

        for (int[][] t:tt) {
            printInts2D(t);
            System.out.println();
        }

    }

}

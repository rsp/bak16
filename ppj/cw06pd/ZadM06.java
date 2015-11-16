public class ZadM06 {

    public static void main(String[] args) {

        int[] t = {0,1,2,5,10,20};

        for (int i = 0; i < t.length; i++) {
            System.out.format("randMax(%d):", t[i]);
            for (int j = 0; j < 20; j++)
                System.out.format(" %d", randMax(t[i]));
            System.out.println();
        }

    }

    static int randMax(int m) {
        return (int)(Math.random()*(m+1));
    }

}

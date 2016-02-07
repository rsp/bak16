public class ZadM06 {

    static int randMax(int m) {
        return (int)(Math.random()*(m+1));
    }

    public static void main(String[] args) {

        int[] t = {0,1,2,5,10,20};

        for (int i:t) {
            System.out.format("randMax(%d):", i);
            for (int j = 0; j < 20; j++)
                System.out.format(" %d", randMax(i));
            System.out.println();
        }

    }

}

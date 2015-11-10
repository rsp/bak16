public class ZadM06 {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i+=5)
            System.out.format("randMax(%d): %d\n", i, randMax(i));

    }

    static int randMax(int m) {
        return (int)(Math.random()*(m+1));
    }

}

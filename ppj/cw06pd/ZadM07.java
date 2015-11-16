public class ZadM07 {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i+=5)
            printInts(randInts(i));

    }

    static int[] randInts(int l) {

        int[] t = new int[l];
        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * 10);
        return t;

    }

    static void printInts(int[] t) {
        for (int i = 0; i < t.length; i++)
            System.out.format("%d ", t[i]);
        System.out.println();
    }

}

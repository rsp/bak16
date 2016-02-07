public class ZadM11 {

    static boolean test(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {

        int[][] t = {{1,2}, {2,1}, {4,2}, {5,2}, {6,2}, {6,3}, {6,4}};

        for (int[] i:t)
            System.out.format("%d, %d - %s\n",
                i[0], i[1], test(i[0], i[1]));

    }

}

public class Zad06 {

    static int getArraySum(int[] t) throws Exception {
        if (t.length == 0)
            throw new Exception("empty array");
        int s = 0;
        for (int i : t)
            s += i;
        return s;
    }

    public static void main(String[] args) {

        int[][] t = {{}, {1,2,3}, {0}};

        for (int[] a : t) {
            try {
                int s = getArraySum(a);
                System.out.println(s);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}

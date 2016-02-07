public class Zad05 {

    static void isEven(int i) throws Exception {
        if (i % 2 != 0) {
            throw new Exception("nieparzysta");
        }
    }

    public static void main(String[] args) {

        int[] t = {0,1,2,3,4};

        for (int i : t) {
            try {
                System.out.print(i + " - ");
                isEven(i);
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}

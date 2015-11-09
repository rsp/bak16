public class Zad5 {

    public static void main(String[] args) {

        int m = 5;

        for (int j = -m; j <= m; j++) {
            for (int i = 0; i < m-Math.abs(j); i++)
                System.out.print(" ");
            for (int i = 0; i < Math.abs(j)*2+1; i++)
                System.out.print("*");
            System.out.println();
        }

    }

}
public class Zad5a {

    public static void main(String[] args) {

        int m = 3;

        for (int j = -m; j <= m; j++) {
            for (int i = 0; i <= Math.abs(j)+m; i++)
                System.out.print(m-i > Math.abs(j) ? " " : "*");
            System.out.println();
        }

    }

}
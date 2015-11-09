public class Zad5a {

    public static void main(String[] args) {

        int m = 10;

        for (int j = -m; j <= m; j++) {
            for (int i = 0; i < m+Math.abs(j)+1; i++)
                System.out.print(Math.abs(j) < m-i ? " " : "*");
            System.out.println();
        }

    }

}
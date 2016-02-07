
public class ZadP16 {

    public static void main(String[] args) {

        int n = 5;

        for (int k = 0; k < n; k++) {
            for (int j = 1; j <= k+2; j++) {
                for (int i = 0; i < n-j+1; i++) System.out.print(" ");
                for (int i = 0; i < 2*j-1; i++) System.out.print("*");
                System.out.println();
            }
        }

    }

}


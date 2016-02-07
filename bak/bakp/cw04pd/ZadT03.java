
public class ZadT03 {

    public static void main(String[] args) {

        int[] t = new int[20];

        for (int i = 0; i < t.length; i++)
            t[i] = (int)(Math.random() * 10);

        for (int i = 0; i < t.length; i++)
            System.out.print(t[i] + " ");
        System.out.println();

        System.out.println("parzyste:");

        for (int i = 0; i < t.length; i++)
            if (t[i] % 2 == 0) System.out.print(t[i] + " ");
        System.out.println();

    }

}


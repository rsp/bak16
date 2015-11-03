
public class ZadT01 {

    public static void main(String[] args) {

        int[] t = new int[20];
        for (int i = 0; i < t.length; i++)
            t[i] = (int)(Math.random() * 10);

        for (int i = 0; i < t.length; i++)
            System.out.println(t[i]);

    }

}


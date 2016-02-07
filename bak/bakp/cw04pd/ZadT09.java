
public class ZadT09 {

    public static void main(String[] args) {

        int m = 20;

        int[] t1 = new int[1 + (int)(Math.random() * m)],
              t2 = new int[1 + (int)(Math.random() * m)],
              t3 = new int[1 + (int)(Math.random() * m)],
              t4 = new int[1 + (int)(Math.random() * m)];
        
        for (int i = 0; i < t1.length; i++)
            t1[i] = (int)(Math.random() * 10);

        for (int i = 0; i < t2.length; i++)
            t2[i] = (int)(Math.random() * 10);
        
        for (int i = 0; i < t3.length; i++)
            t3[i] = (int)(Math.random() * 10);
        
        for (int i = 0; i < t4.length; i++)
            t4[i] = (int)(Math.random() * 10);

        int[][] tt = {t1, t2, t3, t4};

        for (int j = 0; j < tt.length; j++) {
            for (int i = 0; i < tt[j].length; i++)
                System.out.print(tt[j][i] + " ");
            System.out.println();
        }

        int n = Integer.MAX_VALUE, x = -1, y = -1;
        for (int j = 0; j < tt.length; j++)
            for (int i = 0; i < tt[j].length; i++)
                if (tt[j][i] < n) {
                    n = tt[j][i];
                    y = j;
                    x = i;
                }
        
        System.out.println("min: tt["+y+"]["+x+"] = " + tt[y][x]);

    }

}


public class SpaceTest {

    public static void main(String[] args) {

        int bs=0, sc=0, ws=0;
        for (int i = 0; i <= Character.MAX_VALUE; i++) {
            if (((char)i+"").matches("\\s")) bs++;
            if (java.lang.Character.isSpaceChar(i)) sc++;
            if (java.lang.Character.isWhitespace(i)) ws++;
        }

        System.out.format("Biale znaki:\nregex \\s:\t%3d\n", bs);
        System.out.format("isSpaceChar:\t%3d\n", sc);
        System.out.format("isWhitespace:\t%3d\n", ws);

    }

}

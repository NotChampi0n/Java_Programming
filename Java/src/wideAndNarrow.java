public class wideAndNarrow {
    public static void main(String[] args) {
        byte b = 10;
        short s = 200;
        int i = 10;
        long l = 10;
        float f = 10f;
        double d = 10d;
        char c = 10;
        boolean bl = true;

        b = (byte) s;
        System.out.println(b);
//        s = b;
        i = s;
        l = s;
        f = s;
        d = s;
//        c = s;

    }
}

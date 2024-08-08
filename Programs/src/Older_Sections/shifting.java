public class shifting {
    public static void main(String[] args) {
        //To Test and Calculate Bitwise Operators.
//        int x = 10, y = 6, z;
//        int x = 0b1000, y;
//        z = x >> 2;
        int x = 0b1010, y;
        y = x<<6;
        System.out.println(String.format("%32s", Integer.toBinaryString(x)));
        System.out.println(String.format("%32s", Integer.toBinaryString(y)));
        System.out.println(y);
//        System.out.println("Value of y is: " + y);
    }
}

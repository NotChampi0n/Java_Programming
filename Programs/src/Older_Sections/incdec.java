public class incdec {
    public static void main(String[] args) {
        System.out.println("Program to Test Increment & Decrement Operators");
        int x = 5, y, b = 5, c = 4, d;
        float z = 5.3f, v;
        byte u = 5, w;
        char s = 'a', t;
//        Post Increment: y is assigned value of x first and then value of x is incremented.
//        y = x++;
//        Pre Increment: Value of x is first incremented and then assigned to y.
//        y = ++x;
//        Post Increment of Float Values will be increased by 1 keeping the decimal value as it is.
        z++;
//        Post Increment of Byte Values will work the same, if the value of byte is kept at 127 after increment it will become -128.
//        w = u++;
//        Post Increment on char type works by increasing the ASCII value.
//        t = s++;
        d = 2 * b++ + 3 * ++c;
//        System.out.println("New Value of x: " + x);
//        System.out.println("New Value of y: " + y);
        System.out.println("New Value of z: " + z);
//        System.out.println("New Value of u: " + u);
//        System.out.println("New Value of s: " + s);
        System.out.println("New Value of d: " + d);


    }
}

import java.lang.System.*;
public class printfunc {
//    program to learn about different methods/arguments of the print methods.
    public static void main(String[] args) {
        int x = -10, y = 20;
        float f = 123.45f;
        String str = "Test";
//        System.out.printf("Sum of %d and %d is %d", x, y, sum);
//        System.out.printf("Floating Point Representation: %e ", f);
//        System.out.printf("%1$d %2$f %3$s", x, f, str);
        System.out.printf("%f", f);
        System.out.printf("\n%6.4f", f);
    }
}


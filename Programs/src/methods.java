import java.util.Scanner;

public class methods {
//    static int max(int x, int y){
//        if(x>y)
//            return x;
//        else
//            return y;
//    }
    static void inc(int x){
        x++;
        System.out.println("Incremented value of " + x);
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
//        Syntax to call a non-static method in a static main class
//        methods mp = new methods();
//        System.out.println("Maximum number is: " + mp.max(a, b));
//        c = max(a,b);
//        System.out.println("Maximum of the Numbers are: " + c);

//        In this Code the sout statement will print the value of a as it is and inc a will call
//        the method which will modify the formal parameter and not the actual parameter.
        inc(a);
        System.out.println("Test for Value of a: " + a);
    }
}

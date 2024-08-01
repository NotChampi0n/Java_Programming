import java.io.*;
import java.util.*;

public class tryWithResource {
    static void divide() throws Exception {
        try (FileInputStream fi = new FileInputStream("Programs/src/test.txt"); Scanner sc = new Scanner(fi)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("This is a Test.");
            System.out.println(a / c);
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            divide();
        }
        catch (Exception e){
            System.out.println(e);
        }
//        int x = sc.nextInt();
    }
}

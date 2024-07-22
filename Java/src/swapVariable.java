import java.util.Scanner;
public class swapVariable {
    public static void main(String[] args) {
//      Code to swap 2 variables without 3rd or temporary variable.
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value for a: ");
        a = sc.nextInt();
        System.out.println("Enter Value for b: ");
        b = sc.nextInt();
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("Value of a is: " +a);
        System.out.println("Value of b is: " +b);
    }
}

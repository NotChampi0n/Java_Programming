import java.util.Scanner;
public class conditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Values for A, B and C: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("A is Greatest.");
        } else if (b>c) {
            System.out.println("B is Greatest.");
        } else {
            System.out.println("C is Greatest.");
        }
    }
}

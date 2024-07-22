import java.util.Scanner;

public class stuChallFibonacci {
    public static void main(String[] args) {

//        Program to Display Arithmetic/Geometric Progression Series
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int a = sc.nextInt();
        System.out.println("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.println("Enter the number of Terms: ");
        int n = sc.nextInt();
        int sum = a;
        System.out.print("The Series is: ");
        for(int i = 0; i <= n; i++) {
            System.out.print(sum + " ");
//            For Arithmetic Progression we use sum = sum + d
//            sum = sum + d;
//            For Geometric Progression we use sum = sum * d
            sum = sum * d;

        }
    }
}

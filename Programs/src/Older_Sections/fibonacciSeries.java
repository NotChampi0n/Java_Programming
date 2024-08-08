import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Fibonacci Series.");
        System.out.println("Enter the number of elements you wish to see: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.print(a + ", " + b + ", ");
        for (int i = 0; i <n-2; i++){
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}

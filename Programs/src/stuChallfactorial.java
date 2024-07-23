import java.util.Scanner;

public class stuChallfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int j = 1, i = 1;
//        Program for Displaying Multiplication Table
//        for (; j < 11; j++){
//            System.out.println(i + "*" + j + " = " + i * j);
//        }
//        Program to display Sum of Numbers
//        for (; j <= n;j++){
//            i = i+j;
//        }
//        System.out.println(i);
//        Program to Display Factorial of a Number
        for (; j <= n; j++) {
            i = i * j;
        }
        System.out.println("Factorial is: " + i);

    }
}

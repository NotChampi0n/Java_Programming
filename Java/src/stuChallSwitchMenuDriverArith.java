import java.util.Scanner;

public class stuChallSwitchMenuDriverArith {
    public static void main(String[] args) {
        int choice, a, b, sum, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();

        System.out.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("Enter choice of Operations: ");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                sum = a + b;
                System.out.println("Sum is: " + sum);
                break;
            case 2:
                result = a - b;
                System.out.println("Result of Subtraction is: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result of Multiplication is: " + result);
                break;
            case 4:
                result = a / b;
                System.out.println("Result of Division is: " + result);
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}

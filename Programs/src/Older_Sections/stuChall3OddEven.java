import java.util.Scanner;

public class stuChall3OddEven {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else if(num % 2 != 0) {
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is 0");
        }
    }
}
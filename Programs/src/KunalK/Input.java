import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
//        int rollno = input.nextInt();
//        System.out.println("Your Roll Number is: " + rollno);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of Num1 and Num2 is: " + sum);

    }
}

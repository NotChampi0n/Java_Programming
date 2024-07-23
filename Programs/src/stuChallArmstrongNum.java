import java.util.Scanner;

public class stuChallArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i, r, sum = 0, m=n, rev = 0, k=n;
//        Program to display digits of a Number
//        while (num > 0) {
//            rem = num % 10;
//            num = num / 10;
//            System.out.println("The Digits of the Number are: " + rem);
//        }
//        Program to Count Digits of a Number
//        for (i = 0; i < num; i++) {
//            rem = num % 10;
//            num = num / 10;
//        }
//        System.out.println("Number of Digits are: " + i);

//        Program to find if Number is Armstrong or not
//        while (n > 0) {
//            r = n % 10;
//            n = n / 10;
//            sum = sum + r * r * r;
//        }
//        if (sum == m) {
//            System.out.println("Number is Armstrong.");
//        } else{
//            System.out.println("Number is not Armstrong.");
//        }

//        Program to Reverse a Number
//        while (n>0){
//            r = n%10;
//            rev = rev * 10 +r;
//            n = n/10;
//        }
//        System.out.println("Reversed Number is: " + rev);

//        Program to check if a number is palindrome or not.
        while (n>0){
            r = n%10;
            rev = rev * 10 +r;
            n = n/10;
        }
        if(rev == k){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }

    }
}

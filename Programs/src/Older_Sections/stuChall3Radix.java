import java.util.Scanner;
public class stuChall3Radix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number: ");
       String s = sc.nextLine();
       if (s.matches("[0-1]+")){
           System.out.println("Number is in Binary Format, its Radix is 2");
       } else if (s.matches("[0-9A-F]+")){
           System.out.println("Number is in Hexadecimal Format, its Radix is 16");
       } else if (s.matches("[0-7]+")){
           System.out.println("Number is in Octal Format, its Radix is 8");
       } else if (s.matches("[0-9]+")){
           System.out.println("Number is in Decimal Format, its Radix is 10");
       } else {
           System.out.println("Not a Number.");
       }
    }
}

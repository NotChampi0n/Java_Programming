import java.util.Scanner;
public class stuChallRegEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1 = sc.nextLine();
        System.out.println("Is the String Binary?: " + str1.matches("\\d[0-1]+"));
        System.out.println("Is the String Hexadecimal?: " + str1.matches("\\d[0-9a-fA-F]{1,8}"));
        System.out.println("Enter a String for date: ");
        String str2 = sc.nextLine();
        System.out.print("Is the String in Date Format: ");
        System.out.print(str2.matches("\\d[0-3][0-9]/[0-1][0-9]/[01-9]{4}"));
    }
}

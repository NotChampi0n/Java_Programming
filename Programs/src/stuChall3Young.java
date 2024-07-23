import java.util.Scanner;
public class stuChall3Young {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if (age >= 14 && age <= 55) {
            System.out.println("You are Young.");
        }
        else if (age <= 13){
            System.out.println("You are a Child.");
        }
        else {
            System.out.println("You are Old.");
        }
    }
}

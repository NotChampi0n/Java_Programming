import java.util.Scanner;
public class stuChall3Marks {
    public static void main(String[] args) {
        int m1, m2, m3, total;
        float avg;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the first set of Marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter the Second set of Marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter the Third set of Marks: ");
        m3 = sc.nextInt();
        total = m1 + m2 + m3;
        avg = total / 3;
        if (avg >= 70){
            System.out.println("You have got Grade A!");
        } else if (avg >= 60 && avg < 70){
            System.out.println("You have got Grade B!");
        } else if (avg >= 50 && avg < 60){
            System.out.println("You have got Grade C!");
        } else if (avg >=40 && avg < 50) {
            System.out.println("You have got Grade D!");
        } else {
            System.out.println("You have Failed!");
        }
    }
}

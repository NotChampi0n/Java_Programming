import java.util.Scanner;
public class rootOfQuadEq {
    public static void main(String[] args) {
        //Calculate Roots of Quadratic Equation
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        double r1, r2, discrim;
        System.out.println("Enter Value of a: ");
        a = sc.nextFloat();
        System.out.println("Enter Value of b: ");
        b = sc.nextFloat();
        System.out.println("Enter Value of c: ");
        c = sc.nextFloat();
        discrim = Math.sqrt((b*b) - (4*a*c));
        System.out.println("Value of Discriminant is: " + discrim);
        r1 = ((-b + discrim)/(2*a));
        r2 = ((-b - discrim)/(2*a));
        System.out.println("Roots are r1: " + r1 + " and r2: " + r2);

    }
}

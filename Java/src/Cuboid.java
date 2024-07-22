import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        //Calculate Total Surface Area of Cuboid
        int l, b, h, tsa, vol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of L, B and H: ");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        tsa = 2 * (l*b + h*b + l*h);
        vol =  l * b * h;
        System.out.println("Total Surface Area of the Cuboid is: " + tsa);
        System.out.println("Total Volume of the Cuboid is: " + vol);
    }
}

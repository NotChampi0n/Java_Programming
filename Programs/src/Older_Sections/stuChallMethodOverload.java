import java.util.Scanner;

public class stuChallMethodOverload {
    static float area(float a, float b) {
        return a * b;
    }
    static double area(double r){
        return Math.PI * r * r;
    }
    static double area(double a, double b, double c){
        return 0.5f*(a+b)*c;
    }
    static int reverse(int x){
        int rev = 0;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev;
    }
    static int[] reverse(int[] a){
        int[] rev = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            rev[rev.length-i-1]=a[i];
        }
        return rev;
    }
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int x){
        return x>=6 && x<=16;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] rev = reverse(a);
        for(int i:rev){
            System.out.print(i + ", ");
        }
        System.out.println("\nEnter Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Is the Name Validated: " + validate(name));
        System.out.println("Is the Age Validated: " + validate(age));
    }
}

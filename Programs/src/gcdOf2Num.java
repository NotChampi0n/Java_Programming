import java.util.Scanner;

public class gcdOf2Num {
    static int gcdOf2Num(int m, int n){
        while( m!= n){
            if(m>n){
                m = m-n;
            } else if(n>m){
                n = n-m;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int gcd = gcdOf2Num(a,b);
        System.out.println("Greatest Values of Two Numbers are: " + gcd);
    }
}

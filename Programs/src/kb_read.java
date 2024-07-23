import java.util.*;

public class kb_read {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b,c;
        boolean r;
        System.out.println("Enter 2 Numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        r = s.hasNextInt();
        c = a + b;
        System.out.println("The Sum is: " + c);
        System.out.println("Is there another Number: " + r);
//        p = s.next();
//        q = s.nextLine();
//        String q;
//        String p;
//        int a,b,c;
//        System.out.println("Enter Two Numbers: ");
//        a = s.nextInt();
//        b = s.nextInt();
//        c = a+b;
//        System.out.println("Sum of Two Numbers is: " + c);
    }
}

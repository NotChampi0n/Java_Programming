package Older_Sections;
import java.lang.*;
import java.util.Scanner;
public class AofT {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

//      calculating are of a perpendicular triangle
//
//        float b, h, area; //values for calculating area of triangle via b and h
//        System.out.println("Enter value for Breadth: ");
//        b = s.nextFloat();
//        System.out.println("Enter value for Height: ");
//        h = s.nextFloat();
//        area = (b*h)/2; //area of triangle via b and h
//        area = (1f/2f)*b*h; //another way to write it
//        System.out.println("Area of the Triangle is: " + area);

//        calculating area of a triangle via semi perimeter

        int a, b, c;
        float s, area1;
        System.out.println("Enter value for a: ");
        a = sc.nextInt();
        System.out.println("Enter value for b: ");
        b = sc.nextInt();
        System.out.println("Enter value for c: ");
        c = sc.nextInt();
        s = (a + b + c)/2f;
        //Math.sqrt expects a double value as input.
        //Implicit type casting the function input to float will cause loss of precision.
        area1 = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the Triangle (via Semi Perimeter) is: " + area1);

    }
}

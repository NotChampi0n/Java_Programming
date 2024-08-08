import java.util.Scanner;

public class cylinder {
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public double tsa(){
        return circumference()*(height+radius);
    }
    public double volume(){
        return lidArea()*height;
    }
}

class print3{
    public static void main(String[] args) {
        cylinder cr=new cylinder();
        System.out.println("Enter Radius & Height of Cylinder: ");
        Scanner sc = new Scanner(System.in);
        cr.radius = sc.nextDouble();
        cr.height = sc.nextDouble();
        System.out.printf("Lid Area of Cylinder is: %.2f", cr.lidArea());
        System.out.printf("\nCircumference of Cylinder is: %.2f", cr.circumference());
        System.out.printf("\nTSA of Cylinder is: %.2f", cr.tsa());
        System.out.printf("\nVolume of Cylinder is: %.2f", cr.volume());
    }
}

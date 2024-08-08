import java.util.Scanner;

class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
    class print{
        public static void main(String[] args) {
            circle c = new circle();
            System.out.println("Enter the radius of the circle: ");
            Scanner sc = new Scanner(System.in);
            c.radius = sc.nextDouble();
            System.out.println("Area of the circle: " + c.area());
            System.out.println("Circumference of the circle: " + c.circumference());
        }
    }

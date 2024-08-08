class circle1{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
class cylinder1 extends circle1{
    public double height;
    public double volume(){
        return area() * height;
    }
}

public class inheritanceTest {
    public static void main(String[] args) {
        cylinder1 c1 = new cylinder1();

        c1.radius=7;
        c1.height=10;

        System.out.println("Volume of the Cylinder: " + c1.volume());
        System.out.println("Area of the Cylinder: " + c1.circumference());
    }
}

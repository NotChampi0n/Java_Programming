import java.util.Scanner;

class rectangle {
    public double length, breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
}

class print1{
    public static void main(String[] args) {
        System.out.println("Enter the Length & Breadth of the rectangle: ");
        Scanner sc = new Scanner(System.in);
        rectangle rect = new rectangle();
        rect.length = sc.nextDouble();
        rect.breadth = sc.nextDouble();
        System.out.println("The area of the rectangle is: " + rect.area());
        System.out.println("The perimeter of the rectangle is: " + rect.perimeter());
        System.out.println("Is it a Square: " + rect.isSquare());
    }
}

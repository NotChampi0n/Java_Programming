
abstract class shapes {
    abstract public float perimeter();
    abstract public float area();
}

class circle3 extends shapes {
    float radius;
    @Override
    public float perimeter(){
        return (float) Math.PI * radius * 2;
    }
    @Override
    public float area(){
        return (float) Math.PI * radius * radius;
    }
}

class rectangle3 extends shapes {
    float height, width;

    @Override
    public float perimeter(){
        return 2 * (height + width);
    }

    @Override
    public float area(){
        return height * width;
    }
}

public class stuChallAbstractClass {
    public static void main(String[] args) {
        circle3 c3 = new circle3();
        rectangle3 r3 = new rectangle3();

        c3.radius = 10;
        r3.height = 15;
        r3.width = 20;

        System.out.println("Area of Circle: " + c3.area());
        System.out.println("Perimeter of Circle: " + c3.perimeter());
        System.out.println("Area of Rectangle: " + r3.area());
        System.out.println("Perimeter of Rectangle: " + r3.perimeter());
    }
}

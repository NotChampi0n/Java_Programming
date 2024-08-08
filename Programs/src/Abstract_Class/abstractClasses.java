
abstract class parent{
    public parent(){
        System.out.println("Parent Class Constructor");
    }
    public void method1(){
        System.out.println("Parent Class Method 1.");
    }
    abstract public void abmethod();
}

class child extends parent{
    public void abmethod(){
        System.out.println("Parent Class Abstract Method Has been Overridden.");
    }
}

public class abstractClasses {
    public static void main(String[] args) {
        child c1 = new child();
//        Since method1 is inherited from the parent class when we create an object of the child class
//        it will first execute the parent class and its constructor.
        c1.method1();
        c1.abmethod();
    }
}

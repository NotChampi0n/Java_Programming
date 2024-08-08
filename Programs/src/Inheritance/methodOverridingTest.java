
class Super{
    public void display(){
        System.out.println("Superclass display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Subclass display");
    }
    public void check(){
        System.out.println("Exclusive Method of Subclass.");
    }
}

public class methodOverridingTest {
    public static void main(String[] args) {
        Super o1 = new Super();
        o1.display();
//        dynamic method dispatch is used here
        Super su = new Sub();
//        it is giving an error here due to check() method being exclusive to the subclass.
//        su.check();
        su.display();
        Sub o2 = new Sub();
//        the display method inherited from class Super has been overridden by the display method of class sub.
        o2.display();

    }
}
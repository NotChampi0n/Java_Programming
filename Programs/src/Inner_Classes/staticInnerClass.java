class outer3{
    static int x =10;
    int y = 20;
    static class inner{
        void display(){
            System.out.println("Method Display of Static Inner Class inner.");
            System.out.println("x is: " + x);
//            Since y is a non-static member of the outer class it cannot be accessed.
//            System.out.println("y is: " + y);
        }
    }
}
public class staticInnerClass {
    public static void main(String[] args) {
        outer3.inner obj = new outer3.inner();
        obj.display();
    }
}

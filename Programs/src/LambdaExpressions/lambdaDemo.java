@FunctionalInterface
interface lambda{
    public void display();

}
//class demo implements lambda{
//    public void display(){
//        System.out.println("Class Demo Implementing Lambda");
//    }
//}
public class lambdaDemo {
    public static void main(String[] args) {
//        Creating an Object of Class demo using the reference of Interface lambda
//        lambda d1 = new demo();
//        d1.display();

//        Anonymous Inner Class
        lambda d2 = new lambda(){
            public void display(){
                System.out.println("Anonymous Inner Class");
            }
        };
        d2.display();
//        Lambda Expression
        lambda d3 = () -> System.out.println("Lambda Expression");
        d3.display();
    }
}

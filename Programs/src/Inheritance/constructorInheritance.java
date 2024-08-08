class parent1{
    public parent1(){
        System.out.println("Non-Parametrized Parent constructor.");
    }
    public parent1(int a){
        System.out.println("Parametrized Parent constructor. " + a);
    }
}
class child1 extends parent1{
    public child1(){
        System.out.println("Non-Parametrized Child constructor.");
    }
    public child1(int a){
        System.out.println("Parametrized Child constructor.");
    }
    public child1(int a, int b){
        super(a);
        System.out.println("Parameterized Child Constructor with 2 Parameters. " + b);
    }
}
//When creating a child class object, the parent class's default constructor is called automatically. To use a specific
// parent class constructor with parameters, the child class must have a constructor that explicitly calls the parent's
// constructor using the super() keyword
public class constructorInheritance {
    public static void main(String[] args) {
        child1 c1 = new child1(10, 20);
    }
}

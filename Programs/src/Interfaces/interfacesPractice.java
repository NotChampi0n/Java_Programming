interface Test{
    void method1();
    void method2();
}

class extension implements Test{
//    If we want to override only 1 method of the above Abstract Class/Interface we must use @Override keyword.
    public void method1(){
        System.out.println("Subclass extension has Overridden the Method1 from the Interface Test.");
    }
    public void method2() {
        System.out.println("Subclass extension has Overridden the Method2 from the Interface Test.");
    }
}

public class interfacesPractice {
    public static void main(String[] args) {
//        References of Interfaces are Allowed.
        Test t;
//        But we cannot instantiate it in the form of an Object, since its abstract.
//        Test t = new Test();
        t = new extension();
        t.method1();
    }
}

interface My{
    void display();
}
class outer2{
    public void meth(){
        My m = new My(){
            public void display(){
                System.out.println("Anonymous Class Implementing an Interface.");
            }
        };
        m.display();
    }
}

public class anonymousInnerClass {
    public static void main(String[] args) {
        outer2 o2 = new outer2();
        o2.meth();
    }
}

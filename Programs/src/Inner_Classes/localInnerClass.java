class outer1{
    void display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Local Inner Class of Method innerDisplay.");
            }
        }
        Inner inner = new Inner();
        inner.innerDisplay();
    }
}

public class localInnerClass {
    public static void main(String[] args) {
        outer1 o1 = new outer1();
        o1.display();
    }
}

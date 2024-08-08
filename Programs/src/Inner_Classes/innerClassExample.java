class outer{
    int x = 10;
    class innerClass {
        int y = 10;
        void innerDisplay(){
            System.out.println("Method innerDisplay of Inner Class InnerClass of class outer.");
            System.out.println("x is: " + x);
            System.out.println("y is: " + y);
        }
    }
    void outerDisplay(){
        innerClass i = new innerClass();
        i.innerDisplay();
        System.out.println("Method outerDisplay of Class outer.");
        System.out.println(i.y);
    }
}
public class innerClassExample {
    public static void main(String[] args) {
        outer o = new outer();
        o.outerDisplay();
        outer.innerClass j = new outer().new innerClass();
    }
}
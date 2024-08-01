public class packageAndAccessSpecifier{
    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 40;

//    Accessing variables within the same class itself.
    public void display(){
        System.out.println(a + ", " + b + ", " + c + ", " + d);
    }
}

class printing extends packageAndAccessSpecifier{
    public static void main(String[] args) {
        packageAndAccessSpecifier obj = new packageAndAccessSpecifier();
        obj.display();
    }
}

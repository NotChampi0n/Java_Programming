class calculate{
    int area(int l, int b) throws Exception{
        if(l<0 || b<0){
            throw new Exception("Values cannot be Negative");
        }
        return l*b;
    }
    void method1(){
        int a;
        try {
            a = area(-10, 5);
            System.out.println("The area of a given number is " + a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class throwException {
    public static void main(String[] args) {
        calculate c = new calculate();
        c.method1();
    }
}

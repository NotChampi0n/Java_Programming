interface lambda1{
    public void display();
}
class useLambda{
    public void callLambda(lambda1 l1){
        l1.display();
    }
}
class demo{
    public void method1(){
        useLambda myLambda = new useLambda();
        myLambda.callLambda(()->{System.out.println("Inside Lambda Expression");});
    }
}
public class lambdaCapture {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.method1();
    }
}

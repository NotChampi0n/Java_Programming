interface lambdaExp{
    public void display();
}
class lamb{
    int parentClassVar = 20;
    public void display(){
        int parentMethodVar = 0;
        lambdaExp le = () ->{
//            The Value of a Variable inside the Lambda Expression as well as its parent method must be final or effectively final.
            int lambdaExpVar = 0;
//            lambdaExpVar = 10;
            System.out.println("LambdaExpVar: " + lambdaExpVar);
//            parentMethodVar++;
            System.out.println("parentMethodVar: " + parentMethodVar);
            System.out.println("Before ParentClassVar Increment: " + parentClassVar);
            parentClassVar++;
            System.out.println("After ParentClassVar Increment: " + parentClassVar);
        };
        le.display();
    }
}

public class lambdaLocVari {
    public static void main(String[] args) {
        lamb l1 = new lamb();
        l1.display();
    }
}

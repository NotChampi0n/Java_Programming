@FunctionalInterface
interface lampa{
//    public void display(String s);
    public int add(int a, int b);
}
public class lambdaParams {
    public static void main(String[] args) {
//        lampa l = (s) -> {
//            System.out.println(s);
//        };
//        With Return Statement
//        lampa l = (a,b) -> {
//            return a+b;
//        };
//        Without Return Statement
        lampa l = (a,b) -> a+b;
        System.out.println(l.add(10, 20));
    }
}

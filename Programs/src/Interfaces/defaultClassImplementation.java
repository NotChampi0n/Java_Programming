interface Iclass{
    void callback();
    default void t(){
        System.out.println("Default Method of Interface Class Imember.");
    };
}
class test implements Iclass{
    @Override
    public void callback() {
        System.out.println("Overridden Method of Interface Class Iclass.");
    }
}
public class defaultClassImplementation {
    public static void main(String[] args) {
        test t1 = new test();
        t1.callback();
        t1.t();
    }
}

import java.util.*;
class oldClass<T>{
    public void display(){
        System.out.println("Hello World");
    }
    @Deprecated
    public void show(){
        System.out.println("Deprecated Class");
    }
    @SafeVarargs
    final void show1(T...arg){
        for (T x:arg){
            System.out.println(x);
        }
    }
}
public class builtInAnnotations {
    static List l;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int x,y,z;
        x=y=z=1;
        oldClass o1 = new oldClass();
        o1.show1(x,y,z);
//        l.add(10);
//        oldClass o1 = new oldClass();
//        o1.show();
    }
}

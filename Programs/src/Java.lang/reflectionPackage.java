import java.lang.reflect.*;

class reflection {
    private int x;
    protected int y;
    public int z;
    int d;

    public reflection(){}
    public reflection(int a, int b){}

    public void display(String s1, String s2) {}
    public int show(int x, int y) {return 0;}
}
public class reflectionPackage {
    public static void main(String[] args) {
        Class c = reflection.class;
        System.out.println("Name of the Class is: " + c.getName());

        Field[] f = c.getDeclaredFields();
        System.out.print("Fields of the Class is: ");
        for(Field f1 : f){
            System.out.print(f1 + ", ");
        }
        Constructor[] constr = c.getConstructors();
        System.out.print("\nConstructor of the Class is: ");
        for(Constructor d : constr){
            System.out.print(d + ", ");
        }
        Method[] meth = c.getDeclaredMethods();
        System.out.print("\nDeclared Methods of the Class is: ");
        for(Method m : meth){
            System.out.print(m + ", ");
        }
        Parameter param[] = meth[0].getParameters();
        System.out.print("\nParameters of the Method: ");
        for(Parameter p : param){
            System.out.print(p + ", ");
        }
    }


//    reflection r = new reflection();
//    Class c1 = r.getClass();
}

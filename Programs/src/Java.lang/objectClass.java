import java.lang.*;

class object1{
    public void func1(){
        System.out.println("This is a Test.");
    }
//    public String toString(){
//        return "toString Method of Object1";
//    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object obj){
        return this.hashCode() == obj.hashCode();
    }
}

public class objectClass {
    public static void main(String[] args) {
        object1 o1 = new object1();
        object1 o2 = new object1();
        System.out.println("Hash Code of Object o1: " + o1.hashCode());
        System.out.println("Is o1 equal to o2: " + o2.equals(o2));
        System.out.println("To String for Object o1: " + o1.toString());
        System.out.println("Reference of Object o1: " + o1);
    }
}

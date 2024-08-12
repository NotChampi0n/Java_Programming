class test1{
    int x = 10;
    public String toString(){
        return "This is a Test of toString() Class.";
    }
}
public class Main{
    public static void main (String[] args){
        test1 t1 = new test1();
        System.out.println(t1);
        Object obj1 = new String("Hello");
        String str1 = (String)obj1;
    }
}
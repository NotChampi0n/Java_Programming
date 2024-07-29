class finVariable{
    final int MIN = 1;
    final int MAX;
    final static int NORMAL;

    static{
        NORMAL = 10;
    }
    finVariable(){
        MAX = 20;
    }
}
public class finalVariables {
    public static void main(String[] args) {
        finVariable n = new finVariable();
        System.out.println(n.MIN);
        System.out.println(n.MAX);
        System.out.println(n.NORMAL);
    }
}

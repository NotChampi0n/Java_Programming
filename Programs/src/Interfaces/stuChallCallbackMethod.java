interface Imember{
    void callback();
    default void t(){
        System.out.println("Default Method of Interface Class Imember.");
    };
}

//class test implements Imember{
//    int X = 20;
//    @Override
//    public void callback() {}
//}

class store{
    Imember[] memb = new Imember[10];
    int count = 0;

    void register(Imember m){
        memb[count++] = m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            memb[i].callback();
    }
}

class customer2 implements Imember{
    String name;
    customer2(String n){
        name = n;
    }
    @Override
    public void callback(){
        System.out.println("Ok, I will Visit: " + name);
    }

}

public class stuChallCallbackMethod {
    public static void main(String[] args) {
        store st = new store();
        customer2 c1 = new customer2("John");
        customer2 c2 = new customer2("Don");

        st.register(c1);
        st.register(c2);

        st.inviteSale();
//        Default method of Interface Class has been called via its implementation in class customer.
        c2.t();
    }
}


class atm{
    synchronized public void checkBalance(String name){
        System.out.print(name + " Checking");
        try{Thread.sleep(1000);} catch(InterruptedException e){}
        System.out.println(" Balance");
    }
    synchronized public void withdraw(String name, int amt){
        System.out.print(name + " Withdrawing ");
        try{Thread.sleep(1000);} catch(InterruptedException e){}
        System.out.println("₹" + amt);
    }
}
class customer1 extends Thread{
    atm atm;
    String name;
    int amount;

    customer1(String n, int amt, atm a){
        name = n;
        amount = amt;
        atm = a;
    }

    public void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useAtm();
    }
}
public class atmMachine {
    public static void main(String[] args) {
        atm atm = new atm();
        customer1 c1 = new customer1("Ram", 100, atm);
        customer1 c2 = new customer1("Sood", 150, atm);
        c1.start();
        c2.start();
    }
}

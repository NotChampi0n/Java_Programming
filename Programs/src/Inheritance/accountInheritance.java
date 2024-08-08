class account{
    private long accNo, phno;
    private String name, addr, dob;
    protected long balance;

//    getMethods of Account Class
    public long getAccNo(){
        return accNo;
    }
    public long phno(){
        return phno;
    }
    public String getName(){
        return name;
    }
    public String getAddr(){
        return addr;
    }
    public String getDob(){
        return dob;
    }
    public long getBalance(){
        return balance;
    }

//    setMethods for account class.
    public void setAddr(String add){
        addr = add;
    }
    public void setPhno(long phno){
        phno = phno;
    }

//    Constructors for Account Class
    public account(long ac, long phone, String accholdNm, String add, String dob){
        this.accNo = ac;
        name = accholdNm;
        addr = add;
        this.phno = phone;
        this.dob = dob;
        balance = 0;
    }
    public account(){
    }
}

class savingsAccount extends account{
    public void deposit(long amt){
        balance += amt;
    }
    public void withdraw(long amt){
        balance -= amt;
    }
}

class loanAccount extends account{
    public void payEmi(long amt){
        balance -= amt;
    }
    public void repay(long amt){
        if(balance == amt){
            balance = 0;
        }
    }
}


public class accountInheritance {
    public static void main(String[] args) {

    }
}

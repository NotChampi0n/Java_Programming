class product{
    private String itemno, name;
    private float price;
    private int qty;

//    Get methods for Properties of the class.
    public String getItemno() {return itemno;}
    public String getName() {return name;}
    public float getPrice() {return price;}
    public int getQty() {return qty;}

//    Set Methods for Properties of the Class.
    public void setPrice(float p){
        price = p;
    }
    public void setQty(int i){
        qty = i;
    }

//    Constructors for the Class
    public product(String itemno, String name){
        this.itemno = itemno;
        this.name = name;
    }
    public product(String itemno, String name, float price, int qty){
        this.itemno = itemno;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }
}

class customer{
    private String custId, name, address;
    private long phoneno;

//    Get methods for this class.
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public long getPhoneno(){return phoneno;}

//    Set methods for this class.
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneno(long phoneno){
        this.phoneno = phoneno;
    }

//    Constructors of this Class
    public customer(String cid, String name){
        this.custId = cid;
        this.name = name;
    }
    public customer(String custId, String name, String address, long phoneno){
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
    }
}


public class stuChallProdAndCust {
    public static void main(String[] args) {
        product prod = new product("100","Pepsi Can");
        customer cust = new customer("001","John");

        prod.setQty(10);
        prod.setPrice(55.0f);

        cust.setAddress("23, Washington Street, USA");
        cust.setPhoneno(1234567890);

        System.out.println("\nID of the Customer: " + cust.getCustId());
        System.out.println("Name of the Customer: " + cust.getName());
        System.out.println("Address of the Customer: " + cust.getAddress());
        System.out.println("Phone Number of the Customer: " + cust.getPhoneno());

        System.out.println("\nID of the Item Purchased: " + prod.getItemno());
        System.out.println("Name of the Item Purchased: " + prod.getName());
        System.out.println("Quantity of the Item Purchased: " + prod.getQty());
        System.out.println("Price of the Item Purchased: " + prod.getPrice());
    }
}

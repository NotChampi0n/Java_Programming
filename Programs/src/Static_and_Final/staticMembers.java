class hondaCity{
    static long price = 200;
    int a,b;

    public static void onRoadPrice(String city){
        switch(city){
            case "delhi":
                System.out.println("On Road Price in " + city + " : " + (price + price * 0.1));
                break;
            case "mumbai":
                System.out.println("On Road Price in " + city + " : " + (price + price * 0.09));
                break;
            default:
                System.out.println("Enter Correct City");
                break;
        }
    }
}
public class staticMembers {
    public static void main(String[] args) {
//        Static data member price of class hondaCity is directly accessed without creating the object of the class.
        System.out.println("Ex - Showroom Price of Honda City: " + hondaCity.price);
        hondaCity.onRoadPrice("mumbai");
    }
}

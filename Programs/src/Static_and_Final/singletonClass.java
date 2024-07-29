class coffeeMachine{
    private float coffeeQty, milkQty, waterQty, sugarQty;
    static private coffeeMachine cm = null;
    private coffeeMachine(){
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }
    public void fillWater(float qty){
        waterQty = qty;
    }
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    public void fillCoffee(float qty){
        coffeeQty = qty;
    }
    public float getCoffeeQty(){
        return 0.15f;
    }
    static coffeeMachine getInstance(){
        if(cm == null){
            cm = new coffeeMachine();
        }
        return cm;
    }
}
public class singletonClass {
    public static void main(String[] args) {
        coffeeMachine cm = coffeeMachine.getInstance();
        coffeeMachine cm2 = coffeeMachine.getInstance();
        coffeeMachine cm3 = coffeeMachine.getInstance();

        System.out.println(cm + " " + cm2 + " " + cm3);
        if(cm == cm2 && cm == cm3){
            System.out.println("It is the same reference.");
        }
    }
}

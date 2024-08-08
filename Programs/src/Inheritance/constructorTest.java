class cylinderc {
    private int radius, height;
//  set methods
    public void setRadius(int r) {
        if (r <= 0) {
            radius = 0;
        }
        else
            radius = r;
    }
    public void setHeight(int h){
        if (h <= 0) {
            height = 0;
        }
        else
            height = h;
    }
    public void setDimensions(int r, int h){
        radius = r;
        height = h;
    }
//  get methods
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
//  Constructors
    public cylinderc() {
        radius = 0;
        height = 0;
    }
    public cylinderc(int r) {
        radius = r;
        height = 1;
    }
    public cylinderc(int r, int h) {
        radius = r;
        height = h;
    }
//  calculation methods
    public int lidArea(){
        return (int)Math.PI * radius * radius;
    }
    public int circumference(){
        return (int)Math.PI * 2 * radius;
    }
    public int tsa(){
        return circumference()*(height+radius);
    }
    public int volume(){
        return lidArea()*height;
    }
}

public class constructorTest{
    public static void main(String[] args) {
        cylinderc c = new cylinderc();

        c.setHeight(10);
        c.setRadius(7);

        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());
        System.out.println("\nLid Area: " + c.lidArea());
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Total Surface Area: " + c.tsa());
        System.out.println("Volume: " + c.volume());
    }
}
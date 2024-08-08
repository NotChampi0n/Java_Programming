class rectangle2{
    int length, breadth, x = 10;
    rectangle2(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class cuboid3 extends rectangle2{
    int height, x = 20;
    cuboid3(int l, int b, int h){
        super(l, b);
        height = h;
    }
    void display1(){
        System.out.println("Super x: " + super.x);
        System.out.println("X of this Class: " + x);
        System.out.println("\nLength of Parent Clas: " + length);
        System.out.println("Height of the parent Class: " + height);
        System.out.println("Breadth of the parent Class: " + breadth);
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        cuboid3 c1 = new cuboid3(35,45,55);
        c1.display1();
    }
}

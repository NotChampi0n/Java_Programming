class rectangle1{
    int length, breadth;
    rectangle1(int l, int h){
        length = l;
        breadth = h;
    }
    rectangle1(){
        length = breadth = 1;
    }
}

class cuboid1 extends rectangle1{
    int height;

    cuboid1(){
        height= 1;
    }
    cuboid1(int h){
        height = h;
    }
    cuboid1(int l, int b, int h){
        super(l,b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }
}

public class rectangleConstructorInheritance {
    public static void main(String[] args) {
        cuboid1 c1 = new cuboid1(5,3,10);
        System.out.println("Volume of Cuboid: " + c1.volume());
    }
}

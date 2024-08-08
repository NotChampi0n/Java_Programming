class abstractionTest {
    private int length, breadth;

    public void setLength(int length) {
        if (length >= 1)
            this.length = length;
        else
            length = 0;
    }
    public void setBreadth(int breadth) {
        if (breadth >= 1)
            this.breadth = breadth;
        else
            breadth = 0;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
    public int area(){
        return length*breadth;
    }
}
class Test22{
    public static void main(String[] args) {
        abstractionTest rect1 = new abstractionTest();
        rect1.setLength(20);
        rect1.setBreadth(10);
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Breadth: " + rect1.getBreadth());
        System.out.println("Area is: " + rect1.area());
    }
}


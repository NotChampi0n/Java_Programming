public class dboh {
    public static void main(String[] args){
        //c is in decimal num system
        byte b = 10;
        //b is in binary num system
        byte c = 0b1011;
        //d is in hexadecimal num system
        byte d = 0xC;
        //e is in Octal Number System
        byte e = 017;
        //g is declared as a double but has a float literal attached to it, this may lead to conversion imprecision.
        double g = 12.56f;
        System.out.println("Value of c in Decimal is: " + b);
        System.out.println("Value of b in Decimal is: " + c);
        System.out.println("Value of d in Decimal is: " + d);
        System.out.println("Value of e in Decimal is: " + e);
        System.out.println("Double Test: " + g);
    }
}

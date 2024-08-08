public class mask {
    public static void main(String[] args) {
        //Program to merge two nibble variables in  into 1 single byte Variable
        byte a = 9, b = 12, c;
        //result of this expression is of integer type, so we have to typecast it as byte.
        //also the << is having the least precedence, so it should be enclosed in brackets.
        //after this c will have 9 in left side 4 bit and 12 in right side 4 bits.
        //we can hardcode the values directly in place of a and b.
        c = (byte) (a<<4);
        c = (byte) (c|b);
        //this way we can ready 1st 4 bits from right side.
        System.out.println("1st 4 bits from right side: " + ((c&0b11110000) >> 4));
        //when we have show bits from the right side we don't have to shift them because they are already from the least significant side.
        System.out.println("1st 4 bits from left side: " + (c&0b00001111));




    }
}

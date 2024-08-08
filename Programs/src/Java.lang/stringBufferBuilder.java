public class stringBufferBuilder {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuffer sb = new StringBuffer("String");
        StringBuffer sb2 = new StringBuffer("String");
        System.out.println("HashCode before Concatenation: " + s.hashCode());
//        value of s is updated after this assignment concatenation
        s += " World";
        System.out.println("HashCode after Concatenation: " + s.hashCode());
        System.out.println("Value of S after Assignment Concatenation: " + s);

//        value of S remains same after concatenation
        System.out.println(s.concat(" using concat() method"));
        System.out.println(sb.append(" Buffer"));
        System.out.println(sb2.append(" Builder"));
    }
}

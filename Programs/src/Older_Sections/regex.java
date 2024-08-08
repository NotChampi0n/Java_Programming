public class regex {
    public static void main(String[] args) {
//        Program to check for different methods to perform Regular Expressions.
        String str1 = "1";
//        . is used to check for any character.
//        System.out.println(str1.matches("[abc][xz]"));
//        System.out.println(str1.matches("[a-z0-9][0-9]"));
//        System.out.println(str1.matches("a|b"));
//        System.out.println(str1.matches("abc"));
//        System.out.println(str1.matches("\\W"));
        System.out.println(str1.matches("\\w*gmail.*"));
    }
}

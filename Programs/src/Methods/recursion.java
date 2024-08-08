public class recursion {
    static void fun(int x){
//        This Code prints the values in ascending order
//        if (x>0){
//            fun(x-1);
//            System.out.println("Value is: " + x);
//        }
//        This Code Prints the Values in Descending order
        if (x>0){
            System.out.println("Value is: " + x);
            fun(x-1);
        }
    }
    public static void main(String[] args) {
        fun(3);
    }
}

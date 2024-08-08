public class cmdArg {
    public static void main(String[] args) {
//        for(String s:args){
//            System.out.println("Entered String: " + s);
//        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Entered String: " +args[i]);
        }
    }
}

public class cmdLineArgSum {
    public static void main(String[] args) {
        double sum = 0, num;
//        The if Statement and the regex allows us to exclude strings from CLI
        for(int i = 0; i < args.length; i++) {
            if(args[i].matches("[0-9\\.]+")) {
                num = Double.parseDouble(args[i]);
                sum = sum + num;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}

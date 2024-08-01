public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0, c = a / b;
            System.out.println("C: " + c);
            System.out.println("End of Program.");
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero Error: " + e);
        }
        finally {
            System.out.println("This is from Finally block.");
        }
    }
}

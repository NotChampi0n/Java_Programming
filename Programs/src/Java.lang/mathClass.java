public class mathClass {
    public static void main(String[] args) {
        System.out.println("Absolute: " + Math.abs(-123));
        System.out.println("Strict Math Absolute: " + StrictMath.abs(-123));
        System.out.println("Cube Root: " + Math.cbrt(27));
        System.out.println("Exact Decrement: " + Math.decrementExact(7));
        System.out.println("Exact Increment: " + Math.incrementExact(7));
        System.out.println("Exponent Value in Float: " + Math.getExponent(123.12));
        System.out.println("Rounded Division: " + Math.floorDiv(50,3));
        System.out.println("e power x: " + Math.exp(1));
        System.out.println("Log Base 10: " + Math.log10(100));
        System.out.println("Maximum: " + Math.max(100,50));
        System.out.println("Tan: " + Math.tan(45*Math.PI/180));
        System.out.println("Convert to Radians: " + Math.toRadians(90));
        System.out.println("Convert to Radians: " + Math.tanh(1));
        System.out.println("Convert to Radians: " + StrictMath.tanh(1));
        System.out.println("Random Number: " + Math.random()*1000);
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Exact Product: " + Math.multiplyExact(2, 3));
        System.out.println("Next Float Value: " + Math.nextAfter(12.622, 11));
    }
}

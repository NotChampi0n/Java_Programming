public class stuChallArrayCopy {
    public static void main(String[] args) {
        int[] a = {8,6,10,9,2,15,7,13,14,11};
        int[] b = new int[a.length];
        int[] c = {8,6,10,9,2};
        int[] d = new int[10];

//        Program to Copy, Reverse Copy and Increase Size of an Array
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.print("Original Array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
        System.out.print("Copied Array: \n");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println("");
        System.out.print("Reverse Copied Array: \n");
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + ", ");
        }

        System.out.println("\n\nLength of C: " + c.length);
        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }
        d = c;
        System.out.println("Array C: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.println("\nLength of D: " + d.length);
        System.out.println("Array D: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + ", ");
        }
    }
}

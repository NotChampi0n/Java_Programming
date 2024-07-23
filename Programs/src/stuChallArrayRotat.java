public class stuChallArrayRotat {
    public static void main(String[] args) {
        int[] a = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
        int[] b = a;
        System.out.println("Original Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
//        Program to left rotate an array.
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;

        System.out.println("\nLeft Rotated Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
//        Program to right rotate an array
        int temp1 = b[b.length - 1];
        for (int i = b.length - 1; i > 0; i--) {
            b[i] = b[i - 1];
        }
        b[0] = temp1;

        System.out.println("\nRight Rotated Array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}

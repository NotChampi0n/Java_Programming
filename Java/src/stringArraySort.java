public class stringArraySort {
    public static void main(String[] args) {
        String[] arr = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nSorted Array: ");
        java.util.Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

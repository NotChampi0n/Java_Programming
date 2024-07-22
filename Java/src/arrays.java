import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};
        int[] b = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Contents of Array before Increment.");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println("\nContents of Array after Increment.");
        for (int i = 0; i < a.length; i++) {
            System.out.print((++a[i]) + ", ");
        }
//        System.out.println("Enter Values of the array: ");
//        for(int i=0;i<b.length;i++){
//            b[i]=sc.nextInt();
//        }
//        System.out.println("");
//        for (int i=0;i<b.length;i++){
//            System.out.print(b[i] + ", ");
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        System.out.println("");
//        for(int j = a.length-1; j >= 0; j--){
//            System.out.print(a[j] + ", ");
//        }
    }
}

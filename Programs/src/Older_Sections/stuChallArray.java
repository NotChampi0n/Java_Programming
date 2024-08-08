public class stuChallArray {
    public static void main(String[] args) {
        int[] a = {3,9,7,8,12,6,15,5,4,10};
//        Program to check 1st and 2nd Largest Number in Array.
        int max1, max2;
        max1 = max2 = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max1){
                max2 = max1;
                max1 = a[i];
            } else if(a[i]> max2){
                max2 = a[i];
            }
        }
        System.out.println("Largest 1st Number in the Array is: " + max1);
        System.out.println("Largest 2nd Number in the Array is: " + max2);
//        Program to find sum of all Elements.
//        int sum = 0;
//        System.out.print("Sum of Elements of the Array are: ");
//        for (int i = 0; i < a.length; i++) {
//            sum = sum + a[i];
//        }
//        System.out.print(sum);

//        Searching for an Element.
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 6) {
//                System.out.println("Element Found it was at position " + i);
//            }
//            else {
//                System.out.println("Element not found.");
//            }
//        }

    }
}

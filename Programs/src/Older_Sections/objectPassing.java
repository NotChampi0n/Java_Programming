public class objectPassing {
    static void change(int a[], int index, int value){
        a[index] = value;
    }
    static void change2(int a, int value){
        value = a;
    }
    public static void main(String[] args) {
        int[] b = {2,4,6,8,10};
        int c = 10;

        System.out.print("Old Value of b is: ");
        for(int i:b){
            System.out.print(i + ", ");
        }
        System.out.println("");

        change(b,1,20);

        System.out.print("New Value of b is: ");
        for(int i:b){
            System.out.print(i + ", ");
        }
        System.out.println("\nOld Value of c is: " + c);
//        change2 is only changing the value of formal parameter but not the value of the actual parameter.
        change2(c, 10);
        System.out.print("New Value of c is: " + c);
    }
}

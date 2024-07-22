public class jagged2DArray {
    public static void main(String[] args) {
        int[][] a;
        a = new int[3][];
        a[0] = new int[]{1, 2};
        a[1] = new int[]{4, 5, 6, 10};
        a[2] = new int[]{7, 8, 9};

//        Code to print 2D Jagged Array.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}

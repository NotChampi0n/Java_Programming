public class array2d {
    public static void main(String[] args) {
        int[][] a = new int [3][4];
        int[][] b ={{1,2,3,4},{2,4,6,8},{3,5,7,9}};

//        Program to access 2D Array using For Loop.
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[0].length; j++) {
//                System.out.print(b[i][j] + ", ");
//            }
//            System.out.println("");
//        }
//        Program to access 2D Array using For Each Loop.
        for (int[] x: b){
            for(int y: x){
                System.out.print(y + ", ");
            }
            System.out.println("");
        }
    }

}

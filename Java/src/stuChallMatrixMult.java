public class stuChallMatrixMult {
//    Program for 2D Matrix Multiplication
public static void main(String[] args) {
    int sum;
    int[][] a = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
    int[][] b = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
    int[][] c = new int[3][3];

    // ... code to print matrices a and b

    // Matrix multiplication
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b[0].length; j++) {
            sum = 0;
            for (int k = 0; k < a[0].length; k++) {
                sum += a[i][k] * b[k][j];
            }
            c[i][j] = sum;
        }
    }

    System.out.println("\nArray C: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.format("%02d, ", c[i][j]);
        }
        System.out.println("");
    }
}
}

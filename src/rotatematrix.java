import java.util.Scanner;

public class rotatematrix {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        if(m != n || m == 0) {
            System.out.println("need square matrix");
            return;
        }
        int[][] matrix = new int[m][n];
        System.out.println("enter elements of matrix");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printmatrix(matrix, m, n);
        rotate(matrix, m, n);
    }
    private static void printmatrix(int[][] matrix, int m, int n) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }
    private static void rotate(int[][] matrix, int m, int n) {
        for(int layer = 0; layer < m/2; layer ++) {
            for (int y = layer; y < m-layer-1; y++)
            {
                // store current cell in temp variable
                int temp = matrix[layer][y];

                // move values from right to top
                matrix[layer][y] = matrix[y][m-1-layer];

                // move values from bottom to right
                matrix[y][m-1-layer] = matrix[m-1-layer][m-1-y];

                // move values from left to bottom
                matrix[m-1-layer][m-1-y] = matrix[m-1-y][layer];

                // assign temp to left
                matrix[m-1-y][layer] = temp;
            }
        }
        printmatrix(matrix, m, n);
        return;

    }
}

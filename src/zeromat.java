import java.util.Scanner;

public class zeromat {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("enter elements of matrix");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printmatrix(matrix, m, n);
        dozero(matrix, m, n);
        printmatrix(matrix, m, n);
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

    private static void dozero(int[][] matrix, int m, int n) {
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }

        }
        for(int i = 0; i < m; i++) {
            if(row[i]) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < n; j++) {
            if(column[j]) {
                for(int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return;
    }
}

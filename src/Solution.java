public class Solution {
    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 1, 2, 2};
        int[] E = new int[]{1,2,1,3,2,4,2,5};
        int N = 5;
        int[][] matrix = new int[N][N];
        int edges = A.length/2;
        int count = 0;
        int i = 0;
        int j = 1;
        int source = 0;
        int dest = 0;
        while (count <= edges){
            source = E[i];
            dest = E[j];

            i +=2;
            j+=2;
            count++;
        }
    }
}

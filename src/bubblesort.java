import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        int m = n;
        int[] arr = new int[n];
        while (m>0) {
            arr[i] = sc.nextInt();;
            i++;
            m--;
        }
        for(int j = 0; j < n; j++) {
            for(int k = 1; k < n; k++) {
                if(arr[k-1] > arr[k]) {
                    int temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
